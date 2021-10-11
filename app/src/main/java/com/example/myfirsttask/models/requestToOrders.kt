package com.example.myfirsttask.models

import com.example.myfirsttask.models.responseOfLogin.Expose

import com.example.myfirsttask.models.responseOfLogin.SerializedName

class requestToOrders {
    @SerializedName("statusIn")
    @Expose
    private var statusIn: List<String?>? = null

    @SerializedName("modifiedAfter")
    @Expose
    private var modifiedAfter: Any? = null

    @SerializedName("archived")
    @Expose
    private var archived: Boolean? = null

    @SerializedName("isPurchaseOrders")
    @Expose
    private var isPurchaseOrders: Boolean? = null

    @SerializedName("isIncomingOrders")
    @Expose
    private var isIncomingOrders: Boolean? = null

    @SerializedName("loadItems")
    @Expose
    private var loadItems: Boolean? = null

    @SerializedName("recordsPerPage")
    @Expose
    private var recordsPerPage: Int? = null

    @SerializedName("pageNumber")
    @Expose
    private var pageNumber: Int? = null

    fun getStatusIn(): List<String?>? {
        return statusIn
    }

    fun setStatusIn(statusIn: List<String?>?) {
        this.statusIn = statusIn
    }

    fun getModifiedAfter(): Any? {
        return modifiedAfter
    }

    fun setModifiedAfter(modifiedAfter: Any?) {
        this.modifiedAfter = modifiedAfter
    }

    fun getArchived(): Boolean? {
        return archived
    }

    fun setArchived(archived: Boolean?) {
        this.archived = archived
    }

    fun getIsPurchaseOrders(): Boolean? {
        return isPurchaseOrders
    }

    fun setIsPurchaseOrders(isPurchaseOrders: Boolean?) {
        this.isPurchaseOrders = isPurchaseOrders
    }

    fun getIsIncomingOrders(): Boolean? {
        return isIncomingOrders
    }

    fun setIsIncomingOrders(isIncomingOrders: Boolean?) {
        this.isIncomingOrders = isIncomingOrders
    }

    fun getLoadItems(): Boolean? {
        return loadItems
    }

    fun setLoadItems(loadItems: Boolean?) {
        this.loadItems = loadItems
    }

    fun getRecordsPerPage(): Int? {
        return recordsPerPage
    }

    fun setRecordsPerPage(recordsPerPage: Int?) {
        this.recordsPerPage = recordsPerPage
    }

    fun getPageNumber(): Int? {
        return pageNumber
    }

    fun setPageNumber(pageNumber: Int?) {
        this.pageNumber = pageNumber
    }
}