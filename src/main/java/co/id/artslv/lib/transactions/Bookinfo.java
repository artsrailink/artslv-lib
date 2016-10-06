package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bookinfo implements Serializable {

    private String err_code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String action;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rqid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String isloket;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ticketnum;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String channel_id;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    private String bank_code;
//    --------- trans ---------------------
    private String book_code;
    private String num_code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String caller;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String pay_tipe;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String train_no;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String train_name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String org;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String orgname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String des;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd-MMM-yyyy")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate dep_date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dep_time;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "dd-MMM-yyyy")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate arv_date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String arv_time;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String subclass;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String trainclass;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private long normal_sales;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private long extra_fee;
    private long book_balance;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private BigDecimal discount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String createdby;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;
    private String localstat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List pax_list;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String tripid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String subclassid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String scheduleid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transstatus;


    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getBook_code() {
        return book_code;
    }

    public void setBook_code(String book_code) {
        this.book_code = book_code;
    }

    public String getNum_code() {
        return num_code;
    }

    public void setNum_code(String num_code) {
        this.num_code = num_code;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getTrain_no() {
        return train_no;
    }

    public void setTrain_no(String train_no) {
        this.train_no = train_no;
    }

    public String getTrain_name() {
        return train_name;
    }

    public void setTrain_name(String train_name) {
        this.train_name = train_name;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public LocalDate getDep_date() {
        return dep_date;
    }

    public void setDep_date(LocalDate dep_date) {
        this.dep_date = dep_date;
    }

    public String getDep_time() {
        return dep_time;
    }

    public void setDep_time(String dep_time) {
        this.dep_time = dep_time;
    }

    public LocalDate getArv_date() {
        return arv_date;
    }

    public void setArv_date(LocalDate arv_date) {
        this.arv_date = arv_date;
    }

    public String getArv_time() {
        return arv_time;
    }

    public void setArv_time(String arv_time) {
        this.arv_time = arv_time;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getTrainclass() {
        return trainclass;
    }

    public void setTrainclass(String trainclass) {
        this.trainclass = trainclass;
    }

    public long getNormal_sales() {
        return normal_sales;
    }

    public void setNormal_sales(long normal_sales) {
        this.normal_sales = normal_sales;
    }

    public long getExtra_fee() {
        return extra_fee;
    }

    public void setExtra_fee(long extra_fee) {
        this.extra_fee = extra_fee;
    }

    public long getBook_balance() {
        return book_balance;
    }

    public void setBook_balance(long book_balance) {
        this.book_balance = book_balance;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }


    public List getPax_list() {
        return pax_list;
    }

    public void setPax_list(List pax_list) {
        this.pax_list = pax_list;
    }

    public String getIsloket() {
        return isloket;
    }

    public void setIsloket(String isloket) {
        this.isloket = isloket;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getDesname() {
        return desname;
    }

    public void setDesname(String desname) {
        this.desname = desname;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRqid() {
        return rqid;
    }

    public void setRqid(String rqid) {
        this.rqid = rqid;
    }

    public String getPay_tipe() {
        return pay_tipe;
    }

    public void setPay_tipe(String pay_tipe) {
        this.pay_tipe = pay_tipe;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    public String getLocalstat() {
        return localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getTransstatus() {
        return transstatus;
    }

    public void setTransstatus(String transstatus) {
        this.transstatus = transstatus;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

}
