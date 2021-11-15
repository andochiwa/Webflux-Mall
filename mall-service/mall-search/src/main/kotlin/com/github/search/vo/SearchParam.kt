package com.github.search.vo

data class SearchParam(
    var keyword: String? = null,
    var catelog3Id: Int? = null,
    var sort: String? = null, // sort=saleCount_asc
    var hasStock: Int? = null,
    var skuPrice: String? = null, // skuPrice=1_500
    var brandId: List<Long>? = null,
    var attrs: List<String>? = null,
    var pageNum: Int? = null
)
