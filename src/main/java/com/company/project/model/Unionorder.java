package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

public class Unionorder {
    @Id
    @Column(name = "UNIONORDICODE")
    private String unionordicode;

    @Column(name = "UNIONORDCODE")
    private String unionordcode;

    @Column(name = "UNIONORDICODEX")
    private String unionordicodex;

    @Column(name = "UNIONORDCODEX")
    private String unionordcodex;

    @Column(name = "SALORDICODE")
    private String salordicode;

    @Column(name = "SALORDCODE")
    private String salordcode;

    @Column(name = "PURORDICODE")
    private String purordicode;

    @Column(name = "PURORDCODE")
    private String purordcode;

    @Column(name = "CUICODE")
    private String cuicode;

    @Column(name = "VPREPARE")
    private String vprepare;

    @Column(name = "PREDATE")
    private Date predate;

    @Column(name = "MODIFIER")
    private String modifier;

    @Column(name = "MODIFYDATE")
    private Date modifydate;

    @Column(name = "OWNERYEAR")
    private String owneryear;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "VERSIONID")
    private String versionid;

    @Column(name = "SHEETCODE")
    private String sheetcode;

    @Column(name = "LIMID")
    private String limid;

    @Column(name = "RATIFYDATE")
    private Date ratifydate;

    @Column(name = "ORIRATIFYDATE")
    private Date oriratifydate;

    @Column(name = "SYSAUTOGEN")
    private String sysautogen;

    @Column(name = "CORPBCODE")
    private String corpbcode;

    @Column(name = "BCODE")
    private String bcode;

    @Column(name = "KEPTBCODE")
    private String keptbcode;

    @Column(name = "WCODE")
    private String wcode;

    @Column(name = "SALERELATION")
    private String salerelation;

    @Column(name = "RELATIONTYPE")
    private String relationtype;

    @Column(name = "ODATE")
    private Date odate;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    @Column(name = "UPORDCODE")
    private String upordcode;

    @Column(name = "UPFCODE")
    private String upfcode;

    @Column(name = "UPCCODE")
    private String upccode;

    @Column(name = "UPPRJCODE")
    private String upprjcode;

    @Column(name = "UPREMARK")
    private String upremark;

    @Column(name = "DOWNORDCODE")
    private String downordcode;

    @Column(name = "DOWNFCODE")
    private String downfcode;

    @Column(name = "DOWNCCODE")
    private String downccode;

    @Column(name = "DOWNPRJCODE")
    private String downprjcode;

    @Column(name = "DOWNREMARK")
    private String downremark;

    @Column(name = "SALGCCODE")
    private String salgccode;

    @Column(name = "PURGCCODE")
    private String purgccode;

    @Column(name = "GFCODE")
    private String gfcode;

    @Column(name = "GFSERATE")
    private BigDecimal gfserate;

    @Column(name = "GPREDPROFIT")
    private BigDecimal gpredprofit;

    @Column(name = "GDELLIVERYODTYPE")
    private Integer gdelliveryodtype;

    @Column(name = "GDELLIVERLASTDATE")
    private Date gdelliverlastdate;

    @Column(name = "GEXPIRYDATE")
    private Date gexpirydate;

    @Column(name = "GREMARK")
    private String gremark;

    @Column(name = "ORDTYPE")
    private String ordtype;

    @Column(name = "BONUSTYPES")
    private String bonustypes;

    @Column(name = "TIJIANGBILI")
    private BigDecimal tijiangbili;

    @Column(name = "PRICETERM")
    private String priceterm;

    @Column(name = "SHIPMODE")
    private String shipmode;

    @Column(name = "STOCKMODE")
    private String stockmode;

    @Column(name = "DARKMETHOD")
    private String darkmethod;

    @Column(name = "DARKCMSFCODE")
    private String darkcmsfcode;

    @Column(name = "DISCOUNTRATE")
    private BigDecimal discountrate;

    @Column(name = "OVERSHIPRATE")
    private BigDecimal overshiprate;

    @Column(name = "SHORTSHIPRATE")
    private BigDecimal shortshiprate;

    @Column(name = "FREIGHTFCODE")
    private String freightfcode;

    @Column(name = "FREIGHTFSERATE")
    private BigDecimal freightfserate;

    @Column(name = "FREIGHTFCY")
    private BigDecimal freightfcy;

    @Column(name = "INSURANCEMOD")
    private BigDecimal insurancemod;

    @Column(name = "INSURANCEFCODE")
    private String insurancefcode;

    @Column(name = "INSURANCEFSERATE")
    private BigDecimal insurancefserate;

    @Column(name = "INSURANCEFCY")
    private BigDecimal insurancefcy;

    @Column(name = "INSURANCERATE")
    private BigDecimal insurancerate;

    @Column(name = "WFLOWDEFTYPE")
    private String wflowdeftype;

    @Column(name = "U_WFCODE")
    private String uWfcode;

    @Column(name = "U_COORDINATION")
    private String uCoordination;

    @Column(name = "WFLOWDEFCODE")
    private String wflowdefcode;

    @Column(name = "BUSIMODE")
    private String busimode;

    @Column(name = "SFCODE")
    private String sfcode;

    @Column(name = "FCODE")
    private String fcode;

    @Column(name = "FSERATE")
    private BigDecimal fserate;

    @Column(name = "FRERATE1")
    private BigDecimal frerate1;

    @Column(name = "FRERATE2")
    private BigDecimal frerate2;

    /**
     * @return UNIONORDICODE
     */
    public String getUnionordicode() {
        return unionordicode;
    }

    /**
     * @param unionordicode
     */
    public void setUnionordicode(String unionordicode) {
        this.unionordicode = unionordicode;
    }

    /**
     * @return UNIONORDCODE
     */
    public String getUnionordcode() {
        return unionordcode;
    }

    /**
     * @param unionordcode
     */
    public void setUnionordcode(String unionordcode) {
        this.unionordcode = unionordcode;
    }

    /**
     * @return UNIONORDICODEX
     */
    public String getUnionordicodex() {
        return unionordicodex;
    }

    /**
     * @param unionordicodex
     */
    public void setUnionordicodex(String unionordicodex) {
        this.unionordicodex = unionordicodex;
    }

    /**
     * @return UNIONORDCODEX
     */
    public String getUnionordcodex() {
        return unionordcodex;
    }

    /**
     * @param unionordcodex
     */
    public void setUnionordcodex(String unionordcodex) {
        this.unionordcodex = unionordcodex;
    }

    /**
     * @return SALORDICODE
     */
    public String getSalordicode() {
        return salordicode;
    }

    /**
     * @param salordicode
     */
    public void setSalordicode(String salordicode) {
        this.salordicode = salordicode;
    }

    /**
     * @return SALORDCODE
     */
    public String getSalordcode() {
        return salordcode;
    }

    /**
     * @param salordcode
     */
    public void setSalordcode(String salordcode) {
        this.salordcode = salordcode;
    }

    /**
     * @return PURORDICODE
     */
    public String getPurordicode() {
        return purordicode;
    }

    /**
     * @param purordicode
     */
    public void setPurordicode(String purordicode) {
        this.purordicode = purordicode;
    }

    /**
     * @return PURORDCODE
     */
    public String getPurordcode() {
        return purordcode;
    }

    /**
     * @param purordcode
     */
    public void setPurordcode(String purordcode) {
        this.purordcode = purordcode;
    }

    /**
     * @return CUICODE
     */
    public String getCuicode() {
        return cuicode;
    }

    /**
     * @param cuicode
     */
    public void setCuicode(String cuicode) {
        this.cuicode = cuicode;
    }

    /**
     * @return VPREPARE
     */
    public String getVprepare() {
        return vprepare;
    }

    /**
     * @param vprepare
     */
    public void setVprepare(String vprepare) {
        this.vprepare = vprepare;
    }

    /**
     * @return PREDATE
     */
    public Date getPredate() {
        return predate;
    }

    /**
     * @param predate
     */
    public void setPredate(Date predate) {
        this.predate = predate;
    }

    /**
     * @return MODIFIER
     */
    public String getModifier() {
        return modifier;
    }

    /**
     * @param modifier
     */
    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    /**
     * @return MODIFYDATE
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * @param modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * @return OWNERYEAR
     */
    public String getOwneryear() {
        return owneryear;
    }

    /**
     * @param owneryear
     */
    public void setOwneryear(String owneryear) {
        this.owneryear = owneryear;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return VERSIONID
     */
    public String getVersionid() {
        return versionid;
    }

    /**
     * @param versionid
     */
    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    /**
     * @return SHEETCODE
     */
    public String getSheetcode() {
        return sheetcode;
    }

    /**
     * @param sheetcode
     */
    public void setSheetcode(String sheetcode) {
        this.sheetcode = sheetcode;
    }

    /**
     * @return LIMID
     */
    public String getLimid() {
        return limid;
    }

    /**
     * @param limid
     */
    public void setLimid(String limid) {
        this.limid = limid;
    }

    /**
     * @return RATIFYDATE
     */
    public Date getRatifydate() {
        return ratifydate;
    }

    /**
     * @param ratifydate
     */
    public void setRatifydate(Date ratifydate) {
        this.ratifydate = ratifydate;
    }

    /**
     * @return ORIRATIFYDATE
     */
    public Date getOriratifydate() {
        return oriratifydate;
    }

    /**
     * @param oriratifydate
     */
    public void setOriratifydate(Date oriratifydate) {
        this.oriratifydate = oriratifydate;
    }

    /**
     * @return SYSAUTOGEN
     */
    public String getSysautogen() {
        return sysautogen;
    }

    /**
     * @param sysautogen
     */
    public void setSysautogen(String sysautogen) {
        this.sysautogen = sysautogen;
    }

    /**
     * @return CORPBCODE
     */
    public String getCorpbcode() {
        return corpbcode;
    }

    /**
     * @param corpbcode
     */
    public void setCorpbcode(String corpbcode) {
        this.corpbcode = corpbcode;
    }

    /**
     * @return BCODE
     */
    public String getBcode() {
        return bcode;
    }

    /**
     * @param bcode
     */
    public void setBcode(String bcode) {
        this.bcode = bcode;
    }

    /**
     * @return KEPTBCODE
     */
    public String getKeptbcode() {
        return keptbcode;
    }

    /**
     * @param keptbcode
     */
    public void setKeptbcode(String keptbcode) {
        this.keptbcode = keptbcode;
    }

    /**
     * @return WCODE
     */
    public String getWcode() {
        return wcode;
    }

    /**
     * @param wcode
     */
    public void setWcode(String wcode) {
        this.wcode = wcode;
    }

    /**
     * @return SALERELATION
     */
    public String getSalerelation() {
        return salerelation;
    }

    /**
     * @param salerelation
     */
    public void setSalerelation(String salerelation) {
        this.salerelation = salerelation;
    }

    /**
     * @return RELATIONTYPE
     */
    public String getRelationtype() {
        return relationtype;
    }

    /**
     * @param relationtype
     */
    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype;
    }

    /**
     * @return ODATE
     */
    public Date getOdate() {
        return odate;
    }

    /**
     * @param odate
     */
    public void setOdate(Date odate) {
        this.odate = odate;
    }

    /**
     * @return AMOUNT
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * @return UPORDCODE
     */
    public String getUpordcode() {
        return upordcode;
    }

    /**
     * @param upordcode
     */
    public void setUpordcode(String upordcode) {
        this.upordcode = upordcode;
    }

    /**
     * @return UPFCODE
     */
    public String getUpfcode() {
        return upfcode;
    }

    /**
     * @param upfcode
     */
    public void setUpfcode(String upfcode) {
        this.upfcode = upfcode;
    }

    /**
     * @return UPCCODE
     */
    public String getUpccode() {
        return upccode;
    }

    /**
     * @param upccode
     */
    public void setUpccode(String upccode) {
        this.upccode = upccode;
    }

    /**
     * @return UPPRJCODE
     */
    public String getUpprjcode() {
        return upprjcode;
    }

    /**
     * @param upprjcode
     */
    public void setUpprjcode(String upprjcode) {
        this.upprjcode = upprjcode;
    }

    /**
     * @return UPREMARK
     */
    public String getUpremark() {
        return upremark;
    }

    /**
     * @param upremark
     */
    public void setUpremark(String upremark) {
        this.upremark = upremark;
    }

    /**
     * @return DOWNORDCODE
     */
    public String getDownordcode() {
        return downordcode;
    }

    /**
     * @param downordcode
     */
    public void setDownordcode(String downordcode) {
        this.downordcode = downordcode;
    }

    /**
     * @return DOWNFCODE
     */
    public String getDownfcode() {
        return downfcode;
    }

    /**
     * @param downfcode
     */
    public void setDownfcode(String downfcode) {
        this.downfcode = downfcode;
    }

    /**
     * @return DOWNCCODE
     */
    public String getDownccode() {
        return downccode;
    }

    /**
     * @param downccode
     */
    public void setDownccode(String downccode) {
        this.downccode = downccode;
    }

    /**
     * @return DOWNPRJCODE
     */
    public String getDownprjcode() {
        return downprjcode;
    }

    /**
     * @param downprjcode
     */
    public void setDownprjcode(String downprjcode) {
        this.downprjcode = downprjcode;
    }

    /**
     * @return DOWNREMARK
     */
    public String getDownremark() {
        return downremark;
    }

    /**
     * @param downremark
     */
    public void setDownremark(String downremark) {
        this.downremark = downremark;
    }

    /**
     * @return SALGCCODE
     */
    public String getSalgccode() {
        return salgccode;
    }

    /**
     * @param salgccode
     */
    public void setSalgccode(String salgccode) {
        this.salgccode = salgccode;
    }

    /**
     * @return PURGCCODE
     */
    public String getPurgccode() {
        return purgccode;
    }

    /**
     * @param purgccode
     */
    public void setPurgccode(String purgccode) {
        this.purgccode = purgccode;
    }

    /**
     * @return GFCODE
     */
    public String getGfcode() {
        return gfcode;
    }

    /**
     * @param gfcode
     */
    public void setGfcode(String gfcode) {
        this.gfcode = gfcode;
    }

    /**
     * @return GFSERATE
     */
    public BigDecimal getGfserate() {
        return gfserate;
    }

    /**
     * @param gfserate
     */
    public void setGfserate(BigDecimal gfserate) {
        this.gfserate = gfserate;
    }

    /**
     * @return GPREDPROFIT
     */
    public BigDecimal getGpredprofit() {
        return gpredprofit;
    }

    /**
     * @param gpredprofit
     */
    public void setGpredprofit(BigDecimal gpredprofit) {
        this.gpredprofit = gpredprofit;
    }

    /**
     * @return GDELLIVERYODTYPE
     */
    public Integer getGdelliveryodtype() {
        return gdelliveryodtype;
    }

    /**
     * @param gdelliveryodtype
     */
    public void setGdelliveryodtype(Integer gdelliveryodtype) {
        this.gdelliveryodtype = gdelliveryodtype;
    }

    /**
     * @return GDELLIVERLASTDATE
     */
    public Date getGdelliverlastdate() {
        return gdelliverlastdate;
    }

    /**
     * @param gdelliverlastdate
     */
    public void setGdelliverlastdate(Date gdelliverlastdate) {
        this.gdelliverlastdate = gdelliverlastdate;
    }

    /**
     * @return GEXPIRYDATE
     */
    public Date getGexpirydate() {
        return gexpirydate;
    }

    /**
     * @param gexpirydate
     */
    public void setGexpirydate(Date gexpirydate) {
        this.gexpirydate = gexpirydate;
    }

    /**
     * @return GREMARK
     */
    public String getGremark() {
        return gremark;
    }

    /**
     * @param gremark
     */
    public void setGremark(String gremark) {
        this.gremark = gremark;
    }

    /**
     * @return ORDTYPE
     */
    public String getOrdtype() {
        return ordtype;
    }

    /**
     * @param ordtype
     */
    public void setOrdtype(String ordtype) {
        this.ordtype = ordtype;
    }

    /**
     * @return BONUSTYPES
     */
    public String getBonustypes() {
        return bonustypes;
    }

    /**
     * @param bonustypes
     */
    public void setBonustypes(String bonustypes) {
        this.bonustypes = bonustypes;
    }

    /**
     * @return TIJIANGBILI
     */
    public BigDecimal getTijiangbili() {
        return tijiangbili;
    }

    /**
     * @param tijiangbili
     */
    public void setTijiangbili(BigDecimal tijiangbili) {
        this.tijiangbili = tijiangbili;
    }

    /**
     * @return PRICETERM
     */
    public String getPriceterm() {
        return priceterm;
    }

    /**
     * @param priceterm
     */
    public void setPriceterm(String priceterm) {
        this.priceterm = priceterm;
    }

    /**
     * @return SHIPMODE
     */
    public String getShipmode() {
        return shipmode;
    }

    /**
     * @param shipmode
     */
    public void setShipmode(String shipmode) {
        this.shipmode = shipmode;
    }

    /**
     * @return STOCKMODE
     */
    public String getStockmode() {
        return stockmode;
    }

    /**
     * @param stockmode
     */
    public void setStockmode(String stockmode) {
        this.stockmode = stockmode;
    }

    /**
     * @return DARKMETHOD
     */
    public String getDarkmethod() {
        return darkmethod;
    }

    /**
     * @param darkmethod
     */
    public void setDarkmethod(String darkmethod) {
        this.darkmethod = darkmethod;
    }

    /**
     * @return DARKCMSFCODE
     */
    public String getDarkcmsfcode() {
        return darkcmsfcode;
    }

    /**
     * @param darkcmsfcode
     */
    public void setDarkcmsfcode(String darkcmsfcode) {
        this.darkcmsfcode = darkcmsfcode;
    }

    /**
     * @return DISCOUNTRATE
     */
    public BigDecimal getDiscountrate() {
        return discountrate;
    }

    /**
     * @param discountrate
     */
    public void setDiscountrate(BigDecimal discountrate) {
        this.discountrate = discountrate;
    }

    /**
     * @return OVERSHIPRATE
     */
    public BigDecimal getOvershiprate() {
        return overshiprate;
    }

    /**
     * @param overshiprate
     */
    public void setOvershiprate(BigDecimal overshiprate) {
        this.overshiprate = overshiprate;
    }

    /**
     * @return SHORTSHIPRATE
     */
    public BigDecimal getShortshiprate() {
        return shortshiprate;
    }

    /**
     * @param shortshiprate
     */
    public void setShortshiprate(BigDecimal shortshiprate) {
        this.shortshiprate = shortshiprate;
    }

    /**
     * @return FREIGHTFCODE
     */
    public String getFreightfcode() {
        return freightfcode;
    }

    /**
     * @param freightfcode
     */
    public void setFreightfcode(String freightfcode) {
        this.freightfcode = freightfcode;
    }

    /**
     * @return FREIGHTFSERATE
     */
    public BigDecimal getFreightfserate() {
        return freightfserate;
    }

    /**
     * @param freightfserate
     */
    public void setFreightfserate(BigDecimal freightfserate) {
        this.freightfserate = freightfserate;
    }

    /**
     * @return FREIGHTFCY
     */
    public BigDecimal getFreightfcy() {
        return freightfcy;
    }

    /**
     * @param freightfcy
     */
    public void setFreightfcy(BigDecimal freightfcy) {
        this.freightfcy = freightfcy;
    }

    /**
     * @return INSURANCEMOD
     */
    public BigDecimal getInsurancemod() {
        return insurancemod;
    }

    /**
     * @param insurancemod
     */
    public void setInsurancemod(BigDecimal insurancemod) {
        this.insurancemod = insurancemod;
    }

    /**
     * @return INSURANCEFCODE
     */
    public String getInsurancefcode() {
        return insurancefcode;
    }

    /**
     * @param insurancefcode
     */
    public void setInsurancefcode(String insurancefcode) {
        this.insurancefcode = insurancefcode;
    }

    /**
     * @return INSURANCEFSERATE
     */
    public BigDecimal getInsurancefserate() {
        return insurancefserate;
    }

    /**
     * @param insurancefserate
     */
    public void setInsurancefserate(BigDecimal insurancefserate) {
        this.insurancefserate = insurancefserate;
    }

    /**
     * @return INSURANCEFCY
     */
    public BigDecimal getInsurancefcy() {
        return insurancefcy;
    }

    /**
     * @param insurancefcy
     */
    public void setInsurancefcy(BigDecimal insurancefcy) {
        this.insurancefcy = insurancefcy;
    }

    /**
     * @return INSURANCERATE
     */
    public BigDecimal getInsurancerate() {
        return insurancerate;
    }

    /**
     * @param insurancerate
     */
    public void setInsurancerate(BigDecimal insurancerate) {
        this.insurancerate = insurancerate;
    }

    /**
     * @return WFLOWDEFTYPE
     */
    public String getWflowdeftype() {
        return wflowdeftype;
    }

    /**
     * @param wflowdeftype
     */
    public void setWflowdeftype(String wflowdeftype) {
        this.wflowdeftype = wflowdeftype;
    }

    /**
     * @return U_WFCODE
     */
    public String getuWfcode() {
        return uWfcode;
    }

    /**
     * @param uWfcode
     */
    public void setuWfcode(String uWfcode) {
        this.uWfcode = uWfcode;
    }

    /**
     * @return U_COORDINATION
     */
    public String getuCoordination() {
        return uCoordination;
    }

    /**
     * @param uCoordination
     */
    public void setuCoordination(String uCoordination) {
        this.uCoordination = uCoordination;
    }

    /**
     * @return WFLOWDEFCODE
     */
    public String getWflowdefcode() {
        return wflowdefcode;
    }

    /**
     * @param wflowdefcode
     */
    public void setWflowdefcode(String wflowdefcode) {
        this.wflowdefcode = wflowdefcode;
    }

    /**
     * @return BUSIMODE
     */
    public String getBusimode() {
        return busimode;
    }

    /**
     * @param busimode
     */
    public void setBusimode(String busimode) {
        this.busimode = busimode;
    }

    /**
     * @return SFCODE
     */
    public String getSfcode() {
        return sfcode;
    }

    /**
     * @param sfcode
     */
    public void setSfcode(String sfcode) {
        this.sfcode = sfcode;
    }

    /**
     * @return FCODE
     */
    public String getFcode() {
        return fcode;
    }

    /**
     * @param fcode
     */
    public void setFcode(String fcode) {
        this.fcode = fcode;
    }

    /**
     * @return FSERATE
     */
    public BigDecimal getFserate() {
        return fserate;
    }

    /**
     * @param fserate
     */
    public void setFserate(BigDecimal fserate) {
        this.fserate = fserate;
    }

    /**
     * @return FRERATE1
     */
    public BigDecimal getFrerate1() {
        return frerate1;
    }

    /**
     * @param frerate1
     */
    public void setFrerate1(BigDecimal frerate1) {
        this.frerate1 = frerate1;
    }

    /**
     * @return FRERATE2
     */
    public BigDecimal getFrerate2() {
        return frerate2;
    }

    /**
     * @param frerate2
     */
    public void setFrerate2(BigDecimal frerate2) {
        this.frerate2 = frerate2;
    }
}