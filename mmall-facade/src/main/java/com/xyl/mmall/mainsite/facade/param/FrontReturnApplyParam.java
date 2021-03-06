package com.xyl.mmall.mainsite.facade.param;

import java.io.Serializable;
import java.util.List;

import com.xyl.mmall.order.param.RetOrdSkuPriceCalParam;
import com.xyl.mmall.order.param.ReturnBankCardParam;

/**
 * 前端"退货申请"的参数
 * 
 * @author hzwangjianyi@corp.netease.com
 * @create 2014年10月9日 下午5:31:36
 *
 */
@Deprecated
public class FrontReturnApplyParam implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6967355704232294963L;

	private long orderId;
	
	private List<RetOrdSkuEntity> list;
	
	private int refundType;
	
	private ReturnBankCardParam bankCard;
	
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<RetOrdSkuEntity> getList() {
		return list;
	}

	public void setList(List<RetOrdSkuEntity> list) {
		this.list = list;
	}

	public int getRefundType() {
		return refundType;
	}

	public void setRefundType(int refundType) {
		this.refundType = refundType;
	}

	public ReturnBankCardParam getBankCard() {
		return bankCard;
	}

	public void setBankCard(ReturnBankCardParam bankCard) {
		this.bankCard = bankCard;
	}

	public static class RetOrdSkuEntity implements Serializable, RetOrdSkuPriceCalParam {
		/**
		 * 
		 */
		private static final long serialVersionUID = -7372655958067023784L;
		
		private long productid;
		
		private int quantity;
		
		private String comment;
		
		public long getProductid() {
			return productid;
		}
		
		public void setProductid(long productid) {
			this.productid = productid;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		public String getComment() {
			return comment;
		}
		
		public void setComment(String comment) {
			this.comment = comment;
		}

		@Override
		public long idOfOrderSku() {
			return productid;
		}

		@Override
		public long countOfReturn(boolean applySituation) {
			return quantity;
		}
	}
}
