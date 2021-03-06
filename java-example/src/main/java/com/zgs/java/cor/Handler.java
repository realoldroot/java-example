package com.zgs.java.cor;

/**
 * 抽象处理者角色
 */
public abstract class Handler {

    /**
     * 持有后继的责任对象
     */
    protected Handler successor;

    /**
     * 取值方法
     * @return
     */
    public Handler getSuccessor() {
        return successor;
    }

    /**
     * 赋值方法，设置后继的责任对象
     */
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    public abstract String handleFeeRequest(String user , double fee);

}
