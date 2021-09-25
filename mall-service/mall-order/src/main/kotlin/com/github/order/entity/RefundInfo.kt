package com.github.order.entity

import java.math.BigDecimal
import cn.hutool.core.util.IdUtil
import com.fasterxml.jackson.annotation.JsonIgnore
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.springframework.data.annotation.Id
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table
import java.io.Serializable

/**
 *
 * @author Andochiwa
 * @email a1066079469@gmail.com
 * @date 2021-09-26 03:18:13
 */
@Table("oms_refund_info")
@ApiModel
data class RefundInfo (

	@ApiModelProperty(value = "id")
	@Id
	@get:JvmName("deprecate")
	var id: Long? = null,

	@ApiModelProperty(value = "退款的订单")
	var orderReturnId: Long? = null,

	@ApiModelProperty(value = "退款金额")
	var refund: BigDecimal? = null,

	@ApiModelProperty(value = "退款交易流水号")
	var refundSn: String? = null,

	@ApiModelProperty(value = "退款状态")
	var refundStatus: Int? = null,

	@ApiModelProperty(value = "退款渠道[1-支付宝，2-微信，3-银联，4-汇款]")
	var refundChannel: Int? = null,

	@ApiModelProperty(value = "")
	var refundContent: String? = null,


) : Serializable, Persistable<Long> {
	@JsonIgnore
	override fun isNew(): Boolean {
		return if (id == null) {
			id = IdUtil.getSnowflake().nextId()
			true
		} else false
	}
	override fun getId(): Long? = id
}
