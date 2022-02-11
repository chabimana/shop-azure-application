package rw.rdss.data;

public class Shop
{
    private String shopId;
    private String shopName;
    private String websiteUrl;
    private String status;
    private String areaId;
    private String openDate;

    public String getShopId()
    {
        return shopId;
    }

    public void setShopId(final String shopId)
    {
        this.shopId = shopId;
    }

    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(final String shopName)
    {
        this.shopName = shopName;
    }

    public String getWebsiteUrl()
    {
        return websiteUrl;
    }

    public void setWebsiteUrl(final String websiteUrl)
    {
        this.websiteUrl = websiteUrl;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(final String status)
    {
        this.status = status;
    }

    public String getAreaId()
    {
        return areaId;
    }

    public void setAreaId(final String areaId)
    {
        this.areaId = areaId;
    }

    public String getOpenDate()
    {
        return openDate;
    }

    public void setOpenDate(final String openDate)
    {
        this.openDate = openDate;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Shop{");
        sb.append("id='").append(shopId).append('\'');
        sb.append(", shopName='").append(shopName).append('\'');
        sb.append(", websiteUrl='").append(websiteUrl).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", areaId='").append(areaId).append('\'');
        sb.append(", openDate='").append(openDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
