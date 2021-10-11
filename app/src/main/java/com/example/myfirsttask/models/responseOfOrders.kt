package com.example.myfirsttask.models

class responseOfOrders {
    @responseOfLogin.SerializedName("statusIn")
    @responseOfLogin.Expose
    private var statusIn: List<String?>? = null

    @responseOfLogin.SerializedName("modifiedAfter")
    @responseOfLogin.Expose
    private var modifiedAfter: Any? = null

    @responseOfLogin.SerializedName("archived")
    @responseOfLogin.Expose
    private var archived: Boolean? = null

    @responseOfLogin.SerializedName("isPurchaseOrders")
    @responseOfLogin.Expose
    private var isPurchaseOrders: Boolean? = null

    @responseOfLogin.SerializedName("isIncomingOrders")
    @responseOfLogin.Expose
    private var isIncomingOrders: Boolean? = null

    @responseOfLogin.SerializedName("loadItems")
    @responseOfLogin.Expose
    private var loadItems: Boolean? = null

    @responseOfLogin.SerializedName("recordsPerPage")
    @responseOfLogin.Expose
    private var recordsPerPage: Int? = null

    @responseOfLogin.SerializedName("pageNumber")
    @responseOfLogin.Expose
    private var pageNumber: Int? = null

    @responseOfLogin.SerializedName("completedBefore")
    @responseOfLogin.Expose
    private var completedBefore: String? = null

    @responseOfLogin.SerializedName("completedAfter")
    @responseOfLogin.Expose
    private var completedAfter: String? = null

    fun getPurchaseOrders(): Boolean? {
        return isPurchaseOrders
    }

    fun setPurchaseOrders(purchaseOrders: Boolean?) {
        isPurchaseOrders = purchaseOrders
    }

    fun getIncomingOrders(): Boolean? {
        return isIncomingOrders
    }

    fun setIncomingOrders(incomingOrders: Boolean?) {
        isIncomingOrders = incomingOrders
    }

    fun getCompletedBefore(): String? {
        return completedBefore
    }

    fun setCompletedBefore(completedBefore: String?) {
        this.completedBefore = completedBefore
    }

    fun getCompletedAfter(): String? {
        return completedAfter
    }

    fun setCompletedAfter(completedAfter: String?) {
        this.completedAfter = completedAfter
    }

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