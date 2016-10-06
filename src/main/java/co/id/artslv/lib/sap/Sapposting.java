package co.id.artslv.lib.sap;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SAPPOSTING")
public class Sapposting implements Serializable {
        
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SAPPOSTING_ID")
    private String id;
    
    @Column(name = "FILE_NAME")
    private String filename;
    
    @Column(name = "RECORD_NUMBER")
    private int recordnumber;
    
    @Column(name = "TCODE")
    private String tcode;
    
    @Column(name = "PPH")
    private String pph;
    
    @Column(name = "REVERSAL")
    private String reversal;
    
    @Column(name = "DOC_TYPE")
    private String doctype;
    
    @Column(name = "POSTING_DATE")
    private String postingdate;
    
    @Column(name = "DOC_DATE")
    private String docdate;
    
    @Column(name = "NO_DOK")
    private String nodok;
    
    @Column(name = "REFERENCE")
    private String reference;
    
    @Column(name = "DEBIT_KREDIT")
    private String debitkredit;
    
    @Column(name = "ACCOUNT")
    private String account;
    
    @Column(name = "ALTERNATIVE_ACC")
    private String alternativeacc;
    
    @Column(name = "AMMOUNT")
    private String ammount;
    
    @Column(name = "BA")
    private String ba;
    
    @Column(name = "SEGMENT")
    private String segment;
    
    @Column(name = "FA")
    private String fa;
    
    @Column(name = "CC")
    private String cc;
    
    @Column(name = "PC")
    private String pc;
    
    @Column(name = "INTERNAL_ORDER")
    private String internalorder;
    
    @Column(name = "ASSIGNMENT")
    private String assignment;
    
    @Column(name = "VENDOR")
    private String vendor;
    
    @Column(name = "CUSTOMER")
    private String customer;
    
    @Column(name = "POS_STATUS")
    private int posstatus;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "POS_TGL")
    private LocalDateTime postgl;
    
    @Column(name = "STATUS0")
    private String status0;
    
    @Column(name = "NO_DOKSAP")
    private String nodoksap;
    
    @Column(name = "FISCAL_YEAR")
    private int fiscalyear;
    
    @Column(name = "STATUS1")
    private String status1;
    
    @Column(name = "STATUS2")
    private String status2;
    
    @Column(name = "STATUS3")
    private String status3;
    
    @Column(name = "STATUS4")
    private String status4;
    
    @Column(name = "STATUS5")
    private String status5;
    
    @Column(name = "STATUS6")
    private String status6;
    
    @Column(name = "STATUS7")
    private String status7;
    
    @Column(name = "STATUS8")
    private String status8;
    
    @Column(name = "STATUS9")
    private String status9;
    
    @Column(name = "STATUS10")
    private String status10;
    
    @Column(name = "STS_ACCOUNTFA")
    private String stsaccountfa;
    
    @Column(name = "INDEKS")
    private int indeks;
    
    @Column(name = "TOTALIDX")
    private int totalidx;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "ENTRY_DATE")
    private LocalDateTime entrydate;
    
    @Column(name = "VIRTUAL_ACC")
    private String virtualacc;
    
    @Column(name = "WWRVC")
    private String wwrvc;
    
    @Column(name = "KNDNR")
    private String kndnr;
    
    @Column(name = "WWPRD")
    private String wwprd;
    
    @Column(name = "VALUE_DATE")
    private String valuedate;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    public Sapposting() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getRecordnumber() {
        return recordnumber;
    }

    public void setRecordnumber(int recordnumber) {
        this.recordnumber = recordnumber;
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

    public String getReversal() {
        return reversal;
    }

    public void setReversal(String reversal) {
        this.reversal = reversal;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public String getPostingdate() {
        return postingdate;
    }

    public void setPostingdate(String postingdate) {
        this.postingdate = postingdate;
    }

    public String getDocdate() {
        return docdate;
    }

    public void setDocdate(String docdate) {
        this.docdate = docdate;
    }

    public String getNodok() {
        return nodok;
    }

    public void setNodok(String nodok) {
        this.nodok = nodok;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getDebitkredit() {
        return debitkredit;
    }

    public void setDebitkredit(String debitkredit) {
        this.debitkredit = debitkredit;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAlternativeacc() {
        return alternativeacc;
    }

    public void setAlternativeacc(String alternativeacc) {
        this.alternativeacc = alternativeacc;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }

    public String getBa() {
        return ba;
    }

    public void setBa(String ba) {
        this.ba = ba;
    }

    public String getSegment() {
        return segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
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

    public String getInternalorder() {
        return internalorder;
    }

    public void setInternalorder(String internalorder) {
        this.internalorder = internalorder;
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

    public int getPosstatus() {
        return posstatus;
    }

    public void setPosstatus(int posstatus) {
        this.posstatus = posstatus;
    }

    public LocalDateTime getPostgl() {
        return postgl;
    }

    public void setPostgl(LocalDateTime postgl) {
        this.postgl = postgl;
    }

    public String getStatus0() {
        return status0;
    }

    public void setStatus0(String status0) {
        this.status0 = status0;
    }

    public String getNodoksap() {
        return nodoksap;
    }

    public void setNodoksap(String nodoksap) {
        this.nodoksap = nodoksap;
    }

    public int getFiscalyear() {
        return fiscalyear;
    }

    public void setFiscalyear(int fiscalyear) {
        this.fiscalyear = fiscalyear;
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

    public String getStsaccountfa() {
        return stsaccountfa;
    }

    public void setStsaccountfa(String stsaccountfa) {
        this.stsaccountfa = stsaccountfa;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    public int getTotalidx() {
        return totalidx;
    }

    public void setTotalidx(int totalidx) {
        this.totalidx = totalidx;
    }

    public LocalDateTime getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(LocalDateTime entrydate) {
        this.entrydate = entrydate;
    }
    
    public String getVirtualacc() {
        return virtualacc;
    }

    public void setVirtualacc(String virtualacc) {
        this.virtualacc = virtualacc;
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

    public String getValuedate() {
        return valuedate;
    }

    public void setValuedate(String valuedate) {
        this.valuedate = valuedate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}