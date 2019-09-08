package top.coolidea.bloghomework.controller;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import top.coolidea.bloghomework.dto.result.ResultDTO;
import top.coolidea.bloghomework.error.CommonStatusCode;
import top.coolidea.bloghomework.error.ErrorCodeException;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: 魏薏恩
 * @date: 2019/3/5 11:47
 * @description:
 */
public class BaseController {
    @Autowired
    private HttpServletRequest request;

    private static final String SERIALVERSIONUID = "serialVersionUID";



    /**
     * 增删改结果返回
     *
     * @param result 数据库操作结果
     * @return 通用返回类型
     */
    protected ResultDTO judgeResult(int result) {
        if (result > 0) {
            return ResultDTO.successed(result);
        }
        return ResultDTO.failed(CommonStatusCode.NO_DATA);
    }

    /**
     * 检查是否通过jsr303参数验证
     *
     * @param bindingResult jsr303验证结果
     */
    protected void validParam(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<FieldError> ls = bindingResult.getFieldErrors();
            List<Object> errorMsg = new ArrayList<>();
            ls.stream().forEach(objectError -> errorMsg.add(objectError.getField() + "[" + objectError.getDefaultMessage() + "]"));
            throw new ErrorCodeException(CommonStatusCode.REQUEST_ERROR, this.getClass(), errorMsg);
        }
    }


    /**
     * 检查传入对象的值是否都为空
     *
     * @param object
     */
    protected void validParamObject(Object object) {
        if (checkObjectAllFieldsIsNull(object)) {
            List<Object> extraMessage = new ArrayList<>();
            extraMessage.add(object.toString());
            throw new ErrorCodeException(CommonStatusCode.REQUEST_ERROR, this.getClass(), extraMessage);
        }
    }


    /**
     * 检查传入的对象属性是否全为空
     *
     * @param object 需要检查对象
     * @return 检查结果
     */
    protected boolean checkObjectAllFieldsIsNull(Object object) {
        if (null == object) {
            return true;
        }
        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(object) != null && !StrUtil.isEmptyIfStr(field.get(object).toString()) && !field.getName().equals(SERIALVERSIONUID)) {
                    return false;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return true;
    }
}
