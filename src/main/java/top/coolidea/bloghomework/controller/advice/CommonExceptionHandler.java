//package top.coolidea.bloghomework.controller.advice;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import top.coolidea.bloghomework.dto.result.ResultDTO;
//import org.apache.commons.lang3.exception.ExceptionUtils;
//import top.coolidea.bloghomework.error.CommonStatusCode;
//import top.coolidea.bloghomework.error.ErrorCodeException;
//
//
///**
// * @author: weiyien
// * @date: 2019/2/28 15:43
// * @description: 统一异常处理, 发生异常时返回前端指定格式结果.
// */
//@Slf4j
//@RestControllerAdvice
//public class CommonExceptionHandler {
//    /**
//     * 捕捉Exception异常
//     *
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(Exception.class)
//    public ResultDTO exceptionHandler(Exception e) {
//        log.error("Exception:{}", ExceptionUtils.getStackTrace(e));
//        ResultDTO resultDTO = new ResultDTO();
//        resultDTO.setSuccess(false);
//        resultDTO.setErrorCode(CommonStatusCode.SERVER_ERROR.getCode());
//        resultDTO.setMessage(CommonStatusCode.SERVER_ERROR.getMessage());
//        return resultDTO;
//    }
//
//    /**
//     * 捕捉ErrorCodeException异常
//     *
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(ErrorCodeException.class)
//    public ResultDTO errorCodeExceptionHandler(ErrorCodeException e) {
//        log.error("ErrorCodeException:{}", ExceptionUtils.getStackTrace(e));
//        ResultDTO resultDTO = new ResultDTO();
//        resultDTO.setSuccess(false);
//        resultDTO.setErrorCode(e.getCode());
//        StringBuffer stringBuffer = new StringBuffer("错误内容:{");
//        stringBuffer.append(e.getMessage());
//        if (e.getParams() != null && e.getParams().size() > 0) {
//            stringBuffer.append(String.join(",", e.getParams()));
//        }
//        stringBuffer.append("}");
//        resultDTO.setMessage(stringBuffer.toString());
//        resultDTO.setData("");
//        return resultDTO;
//    }
//}
