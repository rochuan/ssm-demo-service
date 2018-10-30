package com.jeff.luo.ssm.provider.pojo.dto;

import java.util.Date;

public class SiteDO {
    private Integer siteId;

    private String siteName;

    private String siteUrl;

    private String siteCode;

    private Integer status;

    private Date gmtCreated;

    private Date gmtUpdated;

    private Byte spiderStatus;

    private Date spiderGmtCreated;

    private Date spriderGmtUpdated;

    private String costValue;

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl == null ? null : siteUrl.trim();
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode == null ? null : siteCode.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtUpdated() {
        return gmtUpdated;
    }

    public void setGmtUpdated(Date gmtUpdated) {
        this.gmtUpdated = gmtUpdated;
    }

    public Byte getSpiderStatus() {
        return spiderStatus;
    }

    public void setSpiderStatus(Byte spiderStatus) {
        this.spiderStatus = spiderStatus;
    }

    public Date getSpiderGmtCreated() {
        return spiderGmtCreated;
    }

    public void setSpiderGmtCreated(Date spiderGmtCreated) {
        this.spiderGmtCreated = spiderGmtCreated;
    }

    public Date getSpriderGmtUpdated() {
        return spriderGmtUpdated;
    }

    public void setSpriderGmtUpdated(Date spriderGmtUpdated) {
        this.spriderGmtUpdated = spriderGmtUpdated;
    }

    public String getCostValue() {
        return costValue;
    }

    public void setCostValue(String costValue) {
        this.costValue = costValue == null ? null : costValue.trim();
    }

    @Override
    public String toString() {
        return "SiteDO{" +
                "siteId=" + siteId +
                ", siteName='" + siteName + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", siteCode='" + siteCode + '\'' +
                ", status=" + status +
                ", gmtCreated=" + gmtCreated +
                ", gmtUpdated=" + gmtUpdated +
                ", spiderStatus=" + spiderStatus +
                ", spiderGmtCreated=" + spiderGmtCreated +
                ", spriderGmtUpdated=" + spriderGmtUpdated +
                ", costValue='" + costValue + '\'' +
                '}';
    }
}