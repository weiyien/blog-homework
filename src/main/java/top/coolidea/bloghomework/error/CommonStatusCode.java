package top.coolidea.bloghomework.error;


/**
 * @author: 魏薏恩
 * @date: 2019/2/28 15:43
 * @description: 自定义状态
 */
public enum CommonStatusCode {
    SUCCESS(StatusCode.SUCCESS, "操作成功"),
    REQUEST_ERROR(StatusCode.REQUEST_ERROR, "发出的请求有错误，服务器没有进行新建或修改数据的操作"),
    NO_DATA(StatusCode.NO_DATA, "发出的请求针对的是不存在的记录，服务器没有进行操作")

    ;
//
    /**
     * 错误状态码
     */
    private Integer code;
    /**
     * 错误信息
     */
    private String message;


    CommonStatusCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
