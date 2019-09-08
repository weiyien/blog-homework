package top.coolidea.bloghomework.error;

/**
 * @author: 魏薏恩
 * @date: 2019/2/28 15:43
 * @description: 结果状态代码
 */
public class StatusCode {

    /**
     * 服务器成功返回请求的数据
     */
    public static final Integer SUCCESS = 100200;
    /**
     * 发出的请求针对的是不存在的记录，服务器没有进行操作
     */
    public static final Integer NO_DATA = 100404;
    /**
     * 发出的请求有错误，服务器没有进行新建或修改数据的操作。
     */
    public static final Integer REQUEST_ERROR = 100400;

}
