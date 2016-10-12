package co.id.artslv.lib.sap;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_sapposting")
public class Sapposting {

    @Column(name = "c_sapposting_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "record_number")
    private Double recordNumber;

    @Column(name = "tcode")
    private String tcode;

    @Column(name = "pph")
    private String pph;

    @Column(name = "reversal")
    private Character reversal;

    @Column(name = "doc_type")
    private String docType;

    @Column(name = "posting_date")
    private String postingDate;

    @Column(name = "doc_date")
    private String docDate;

    @Column(name = "no_dok")
    private String noDok;

    @Column(name = "reference")
    private String reference;

    @Column(name = "debit_kredit")
    private Character debitKredit;

    @Column(name = "account")
    private String account;

    @Column(name = "alternative_acc")
    private String alternativeAcc;

    @Column(name = "amount")
    private String amount;

    @Column(name = "ba")
    private String ba;

    @Column(name = "segmen")
    private String segmen;

    @Column(name = "fa")
    private String fa;

    @Column(name = "cc")
    private String cc;

    @Column(name = "pc")
    private String pc;

    @Column(name = "internal_order", table = "arts_t_sapposting")
    private Character internalOrder;

    @Column(name = "assignment")
    private String assignment;

    @Column(name = "vendor", table = "arts_t_sapposting")
    private String vendor;

    @Column(name = "customer", table = "arts_t_sapposting")
    private String customer;

    @Column(name = "pos_status")
    private Double posStatus;

    @Column(name = "pos_tgl", table = "arts_t_sapposting")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate posTgl;

    @Column(name = "status0", table = "arts_t_sapposting")
    private String status0;

    @Column(name = "no_doksap", table = "arts_t_sapposting")
    private String noDoksap;

    @Column(name = "fiscal_year", table = "arts_t_sapposting")
    private Double fiscalYear;

    @Column(name = "status1", table = "arts_t_sapposting")
    private String status1;

    @Column(name = "status2", table = "arts_t_sapposting")
    private String status2;

    @Column(name = "status3", table = "arts_t_sapposting")
    private String status3;

    @Column(name = "status4", table = "arts_t_sapposting")
    private String status4;

    @Column(name = "status5", table = "arts_t_sapposting")
    private String status5;

    @Column(name = "status6", table = "arts_t_sapposting")
    private String status6;

    @Column(name = "status7", table = "arts_t_sapposting")
    private String status7;

    @Column(name = "status8", table = "arts_t_sapposting")
    private String status8;

    @Column(name = "status9", table = "arts_t_sapposting")
    private String status9;

    @Column(name = "status10", table = "arts_t_sapposting")
    private String status10;

    @Column(name = "sts_accountfa", table = "arts_t_sapposting")
    private Character stsAccountfa;

    @Column(name = "indeks")
    private double indeks;

    @Column(name = "totalidx")
    private double totalidx;

    @Column(name = "entry_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate entryDate;

    @Column(name = "virtual_acc")
    private String virtualAcc;

    @Column(name = "wwrvc", table = "arts_t_sapposting")
    private String wwrvc;

    @Column(name = "kndnr", table = "arts_t_sapposting")
    private String kndnr;

    @Column(name = "wwprd", table = "arts_t_sapposting")
    private String wwprd;

    @Column(name = "value_date", table = "arts_t_sapposting")
    private String valueDate;

    @Column(name = "c_sapposting_createdby")
    private String Createdby;

    @Column(name = "c_sapposting_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Double getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(Double recordNumber) {
        this.recordNumber = recordNumber;
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public String getPph() {
        return pph;
    }

    public void setPph(String pph) {
        this.pph = pph;
    }

    public Character getReversal() {
        return reversal;
    }

    public void setReversal(Character reversal) {
        this.reversal = reversal;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getPostingDate() {
        return postingDate;
    }

    public void setPostingDate(String postingDate) {
        this.postingDate = postingDate;
    }

    public String getDocDate() {
        return docDate;
    }

    public void setDocDate(String docDate) {
        this.docDate = docDate;
    }

    public String getNoDok() {
        return noDok;
    }

    public void setNoDok(String noDok) {
        this.noDok = noDok;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Character getDebitKredit() {
        return debitKredit;
    }

    public void setDebitKredit(Character debitKredit) {
        this.debitKredit = debitKredit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlternativeAcc() {
        return alternativeAcc;
    }

    public void setAlternativeAcc(String alternativeAcc) {
        this.alternativeAcc = alternativeAcc;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getBa() {
        return ba;
    }

    public void setBa(String ba) {
        this.ba = ba;
    }

    public String getSegmen() {
        return segmen;
    }

    public void setSegmen(String segmen) {
        this.segmen = segmen;
    }

    public String getFa() {
        return fa;
    }

    public void setFa(String fa) {
        this.fa = fa;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getPc() {
        return pc;
    }

    public void setPc(String pc) {
        this.pc = pc;
    }

    public Character getInternalOrder() {
        return internalOrder;
    }

    public void setInternalOrder(Character internalOrder) {
        this.internalOrder = internalOrder;
    }

    public String getAssignment() {
        return assignment;
    }

    public void setAssignment(String assignment) {
        this.assignment = assignment;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Double getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(Double posStatus) {
        this.posStatus = posStatus;
    }

    public LocalDate getPosTgl() {
        return posTgl;
    }

    public void setPosTgl(LocalDate posTgl) {
        this.posTgl = posTgl;
    }

    public String getStatus0() {
        return status0;
    }

    public void setStatus0(String status0) {
        this.status0 = status0;
    }

    public String getNoDoksap() {
        return noDoksap;
    }

    public void setNoDoksap(String noDoksap) {
        this.noDoksap = noDoksap;
    }

    public Double getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(Double fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public String getStatus1() {
        return status1;
    }

    public void setStatus1(String status1) {
        this.status1 = status1;
    }

    public String getStatus2() {
        return status2;
    }

    public void setStatus2(String status2) {
        this.status2 = status2;
    }

    public String getStatus3() {
        return status3;
    }

    public void setStatus3(String status3) {
        this.status3 = status3;
    }

    public String getStatus4() {
        return status4;
    }

    public void setStatus4(String status4) {
        this.status4 = status4;
    }

    public String getStatus5() {
        return status5;
    }

    public void setStatus5(String status5) {
        this.status5 = status5;
    }

    public String getStatus6() {
        return status6;
    }

    public void setStatus6(String status6) {
        this.status6 = status6;
    }

    public String getStatus7() {
        return status7;
    }

    public void setStatus7(String status7) {
        this.status7 = status7;
    }

    public String getStatus8() {
        return status8;
    }

    public void setStatus8(String status8) {
        this.status8 = status8;
    }

    public String getStatus9() {
        return status9;
    }

    public void setStatus9(String status9) {
        this.status9 = status9;
    }

    public String getStatus10() {
        return status10;
    }

    public void setStatus10(String status10) {
        this.status10 = status10;
    }

    public Character getStsAccountfa() {
        return stsAccountfa;
    }

    public void setStsAccountfa(Character stsAccountfa) {
        this.stsAccountfa = stsAccountfa;
    }

    public double getIndeks() {
        return indeks;
    }

    public void setIndeks(double indeks) {
        this.indeks = indeks;
    }

    public double getTotalidx() {
        return totalidx;
    }

    public void setTotalidx(double totalidx) {
        this.totalidx = totalidx;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public String getVirtualAcc() {
        return virtualAcc;
    }

    public void setVirtualAcc(String virtualAcc) {
        this.virtualAcc = virtualAcc;
    }

    public String getWwrvc() {
        return wwrvc;
    }

    public void setWwrvc(String wwrvc) {
        this.wwrvc = wwrvc;
    }

    public String getKndnr() {
        return kndnr;
    }

    public void setKndnr(String kndnr) {
        this.kndnr = kndnr;
    }

    public String getWwprd() {
        return wwprd;
    }

    public void setWwprd(String wwprd) {
        this.wwprd = wwprd;
    }

    public String getValueDate() {
        return valueDate;
    }

    public void setValueDate(String valueDate) {
        this.valueDate = valueDate;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String Createdby) {
        this.Createdby = Createdby;
    }

    public LocalDateTime getCreatedon() {
        return Createdon;
    }

    public void setCreatedon(LocalDateTime Createdon) {
        this.Createdon = Createdon;
    }

    
}
