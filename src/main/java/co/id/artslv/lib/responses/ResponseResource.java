/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.responses;

import co.id.artslv.lib.PageImplBean;
import co.id.artslv.lib.auth.Auth;
import co.id.artslv.lib.closing.Closing;
import co.id.artslv.lib.comservice.Serviceprovider;
import co.id.artslv.lib.location.City;
import co.id.artslv.lib.log.Activitylog;
import co.id.artslv.lib.log.Seatlog;
import co.id.artslv.lib.members.MemMemtype;
import co.id.artslv.lib.members.MemShiptype;
import co.id.artslv.lib.members.Reduction;
import co.id.artslv.lib.members.Reductionexcl;
import co.id.artslv.lib.messages.Announcement;
import co.id.artslv.lib.messages.Message;
import co.id.artslv.lib.messages.Msgattc;
import co.id.artslv.lib.messages.Msgto;
import co.id.artslv.lib.modules.Module;
import co.id.artslv.lib.modules.Moduletype;
import co.id.artslv.lib.report.Penjunit;
import co.id.artslv.lib.sap.Sapcoa;
import co.id.artslv.lib.sap.Sapposting;
import co.id.artslv.lib.schedule.*;
import co.id.artslv.lib.trains.Train;
import co.id.artslv.lib.trains.Trainmiles;
import co.id.artslv.lib.trains.Wagon;
import co.id.artslv.lib.trains.Wagondet;
import co.id.artslv.lib.transactions.*;
import co.id.artslv.lib.users.Usergroup;
import co.id.artslv.lib.users.Userpass;
import co.id.artslv.lib.location.Province;
import co.id.artslv.lib.modules.Objactivity;

import co.id.artslv.lib.report.Okupansi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import co.id.artslv.lib.org.Area;
import co.id.artslv.lib.org.Channel;
import co.id.artslv.lib.org.Domain;
import co.id.artslv.lib.org.Ip;
import co.id.artslv.lib.org.IpUnit;
import co.id.artslv.lib.comservice.Service;
import co.id.artslv.lib.modules.Privileges;
import co.id.artslv.lib.org.Agentdet;
import co.id.artslv.lib.org.Hidenoka;
import co.id.artslv.lib.org.Holiday;
import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.org.Stdistance;
import co.id.artslv.lib.trains.Traintype;
import co.id.artslv.lib.org.Unit;
import co.id.artslv.lib.org.Unitfee;
import co.id.artslv.lib.payments.Bank;
import co.id.artslv.lib.payments.ChannelPaytype;
import co.id.artslv.lib.members.Member;
import co.id.artslv.lib.members.Membership;
import co.id.artslv.lib.members.Membertype;
import co.id.artslv.lib.members.Occupationtype;
import co.id.artslv.lib.payments.Discount;
import co.id.artslv.lib.payments.Discounttype;
import co.id.artslv.lib.payments.Discountunit;
import co.id.artslv.lib.payments.Paytype;
import co.id.artslv.lib.payments.Rate;
import co.id.artslv.lib.payments.Ratedetail;
import co.id.artslv.lib.payments.Ratetype;
import co.id.artslv.lib.log.Transactionlog;
import co.id.artslv.lib.manualtrans.Baggage;
import co.id.artslv.lib.manualtrans.Baggagetrans;
import co.id.artslv.lib.manualtrans.Compensation;
import co.id.artslv.lib.manualtrans.Dailyticket;
import co.id.artslv.lib.manualtrans.Pasepartu;
//import co.id.rtsng.lib.manualtrans.Refundmanual_x;
import co.id.artslv.lib.manualtrans.Refundupload;
import co.id.artslv.lib.manualtrans.Suplisi;
import co.id.artslv.lib.members.MemShiptrans;
import co.id.artslv.lib.org.Title;
import co.id.artslv.lib.payments.Discountsch;
import co.id.artslv.lib.payments.Voucher;
import co.id.artslv.lib.payments.Voucheramount;
import co.id.artslv.lib.payments.Vouchertype;
import co.id.artslv.lib.sap.Sapschedule;
import co.id.artslv.lib.sap.Sapwagonclass;
import co.id.artslv.lib.trainplan.Daop;
import co.id.artslv.lib.trainplan.Gapeka;
import co.id.artslv.lib.trainplan.Ka;
import co.id.artslv.lib.trainplan.Rtsngtglkajalanpnpall;
import co.id.artslv.lib.trainplan.Rtsngtglkajalanpnpstop;
import co.id.artslv.lib.trainplan.Tabstn;
import co.id.artslv.lib.trains.Subclass;
import co.id.artslv.lib.trains.Trainrunning;
import co.id.artslv.lib.trains.Wagonclass;
import co.id.artslv.lib.org.AgentBalance;
import co.id.artslv.lib.org.AgentTrans;
import co.id.artslv.lib.users.Shift;
import co.id.artslv.lib.users.UnitUser;
import co.id.artslv.lib.users.User;
import co.id.artslv.lib.users.Usersession;
import co.id.artslv.lib.users.Usertype;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name = "responseResource")
public class ResponseResource {
//    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @JsonInclude(Include.NON_NULL)
    private String err_code;
    @JsonInclude(Include.NON_NULL)
    private String msg;
    @JsonInclude(Include.NON_NULL)
    private String action;
    @JsonInclude(Include.NON_NULL)
    private String actdomain;
    @JsonInclude(Include.NON_NULL)
    private String userid;
    @JsonInclude(Include.NON_NULL)
    private String unitid;
    @JsonInclude(Include.NON_NULL)
    private String shiftid;
    @JsonInclude(Include.NON_NULL)
    private String stasiunid;
    @JsonInclude(Include.NON_NULL)
    private String tripid;

    //----------------Model & List Model-------------------------------------------//
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Domain> pagedomain;
    @JsonInclude(Include.NON_NULL)
    private Domain domain;
    @JsonInclude(Include.NON_NULL)
    private List<Domain> listdomain;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Area> pagearea;
    @JsonInclude(Include.NON_NULL)
    private Area area;
    @JsonInclude(Include.NON_NULL)
    private List<Area> listarea;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Stasiun> pagestasiun;
    @JsonInclude(Include.NON_NULL)
    private Stasiun stasiun;
    @JsonInclude(Include.NON_NULL)
    private List<Stasiun> liststasiun;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Channel> pagechannel;
    @JsonInclude(Include.NON_NULL)
    private Channel channel;
    @JsonInclude(Include.NON_NULL)
    private List<Channel> listchannel;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Unit> pageunit;
    @JsonInclude(Include.NON_NULL)
    private Unit unit;
    @JsonInclude(Include.NON_NULL)
    private List<Unit> listunit;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<IpUnit> pageipunit;
    @JsonInclude(Include.NON_NULL)
    private IpUnit ipunit;
    @JsonInclude(Include.NON_NULL)
    private List<IpUnit> listipunit;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Ip> pageip;
    @JsonInclude(Include.NON_NULL)
    private Ip ip;
    @JsonInclude(Include.NON_NULL)
    private List<Ip> listip;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Traintype> pagetraintype;
    @JsonInclude(Include.NON_NULL)
    private Traintype traintype;
    @JsonInclude(Include.NON_NULL)
    private List<Traintype> listtraintype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Train> pagetrain;
    @JsonInclude(Include.NON_NULL)
    private Train train;
    @JsonInclude(Include.NON_NULL)
    private List<Train> listtrain;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Wagonclass> pagewagonclass;
    @JsonInclude(Include.NON_NULL)
    private Wagonclass wagonclass;
    @JsonInclude(Include.NON_NULL)
    private List<Wagonclass> listwagonclass;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Wagon> pagewagon;
    @JsonInclude(Include.NON_NULL)
    private Wagon wagon;
    @JsonInclude(Include.NON_NULL)
    private List<Wagon> listwagon;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Wagondet> pagewagondet;
    @JsonInclude(Include.NON_NULL)
    private Wagondet wagondet;
    @JsonInclude(Include.NON_NULL)
    private List<Wagondet> listwagondet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Subclass> pagesubclass;
    @JsonInclude(Include.NON_NULL)
    private Subclass subclass;
    @JsonInclude(Include.NON_NULL)
    private List<Subclass> listsubclass;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Province> pageprovince;
    @JsonInclude(Include.NON_NULL)
    private Province province;
    @JsonInclude(Include.NON_NULL)
    private List<Province> listprovince;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<City> pagecity;
    @JsonInclude(Include.NON_NULL)
    private City city;
    @JsonInclude(Include.NON_NULL)
    private List<City> listcity;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Moduletype> pagemoduletype;
    @JsonInclude(Include.NON_NULL)
    private Moduletype moduletype;
    @JsonInclude(Include.NON_NULL)
    private List<Moduletype> listmoduletype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Module> pagemodule;
    @JsonInclude(Include.NON_NULL)
    private Module module;
    @JsonInclude(Include.NON_NULL)
    private List<Module> listmodule;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Objactivity> pageobjactivity;
    @JsonInclude(Include.NON_NULL)
    private Objactivity objactivity;
    @JsonInclude(Include.NON_NULL)
    private List<Objactivity> listobjactivity;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Privileges> pageprivileges;
    @JsonInclude(Include.NON_NULL)
    private Privileges privileges;
    @JsonInclude(Include.NON_NULL)
    private List<Privileges> listprivileges;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Usergroup> pageusergroup;
    @JsonInclude(Include.NON_NULL)
    private Usergroup usergroup;
    @JsonInclude(Include.NON_NULL)
    private List<Usergroup> listusergroup;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Usertype> pageusertype;
    @JsonInclude(Include.NON_NULL)
    private Usertype usertype;
    @JsonInclude(Include.NON_NULL)
    private List<Usertype> listusertype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Userpass> pageuserpass;
    @JsonInclude(Include.NON_NULL)
    private Userpass userpass;
    @JsonInclude(Include.NON_NULL)
    private List<Userpass> listuserpass;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<User> pageuser;
    @JsonInclude(Include.NON_NULL)
    private User user;
    @JsonInclude(Include.NON_NULL)
    private List<User> listuser;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<UnitUser> pageunituser;
    @JsonInclude(Include.NON_NULL)
    private UnitUser unituser;
    @JsonInclude(Include.NON_NULL)
    private List<UnitUser> listunituser;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Bank> pagebank;
    @JsonInclude(Include.NON_NULL)
    private Bank bank;
    @JsonInclude(Include.NON_NULL)
    private List<Bank> listbank;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Paytype> pagepaytype;
    @JsonInclude(Include.NON_NULL)
    private Paytype paytype;
    @JsonInclude(Include.NON_NULL)
    private List<Paytype> listpaytype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Rate> pagerate;
    @JsonInclude(Include.NON_NULL)
    private Rate rate;
    @JsonInclude(Include.NON_NULL)
    private List<Rate> listrate;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Ratetype> pageratetype;
    @JsonInclude(Include.NON_NULL)
    private Ratetype ratetype;
    @JsonInclude(Include.NON_NULL)
    private List<Ratetype> listratetype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Ratedetail> pageratedetail;
    @JsonInclude(Include.NON_NULL)
    private Ratedetail ratedetail;
    @JsonInclude(Include.NON_NULL)
    private List<Ratedetail> listratedetail;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Discounttype> pagediscounttype;
    @JsonInclude(Include.NON_NULL)
    private Discounttype discounttype;
    @JsonInclude(Include.NON_NULL)
    private List<Discounttype> listdiscounttype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Discount> pagediscount;
    @JsonInclude(Include.NON_NULL)
    private Discount discount;
    @JsonInclude(Include.NON_NULL)
    private List<Discount> listdiscount;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Discountunit> pagediscountunit;
    @JsonInclude(Include.NON_NULL)
    private Discountunit discountunit;
    @JsonInclude(Include.NON_NULL)
    private List<Discountunit> listdiscountunit;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<ChannelPaytype> pagechannelpaytype;
    @JsonInclude(Include.NON_NULL)
    private ChannelPaytype channelpaytype;
    @JsonInclude(Include.NON_NULL)
    private List<ChannelPaytype> listchannelpaytype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Stdistance> pagestdistance;
    @JsonInclude(Include.NON_NULL)
    private Stdistance stdistance;
    @JsonInclude(Include.NON_NULL)
    private List<Stdistance> liststdistance;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Announcement> pageannouncement;
    @JsonInclude(Include.NON_NULL)
    private Announcement announcement;
    @JsonInclude(Include.NON_NULL)
    private List<Announcement> listannouncement;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Message> pagemessage;
    @JsonInclude(Include.NON_NULL)
    private Message message;
    @JsonInclude(Include.NON_NULL)
    private List<Message> listmessage;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Msgto> pagemsgto;
    @JsonInclude(Include.NON_NULL)
    private Msgto msgto;
    @JsonInclude(Include.NON_NULL)
    private List<Msgto> listmsgto;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Msgattc> pagemsgattc;
    @JsonInclude(Include.NON_NULL)
    private Msgattc msgattc;
    @JsonInclude(Include.NON_NULL)
    private List<Msgattc> listmsgattc;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Holiday> pageholiday;
    @JsonInclude(Include.NON_NULL)
    private Holiday holiday;
    @JsonInclude(Include.NON_NULL)
    private List<Holiday> listholiday;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Shift> pageshift;
    @JsonInclude(Include.NON_NULL)
    private Shift shift;
    @JsonInclude(Include.NON_NULL)
    private List<Shift> listshift;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Unitfee> pageunitfee;
    @JsonInclude(Include.NON_NULL)
    private Unitfee unitfee;
    @JsonInclude(Include.NON_NULL)
    private List<Unitfee> listunitfee;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Hidenoka> pagehidenoka;
    @JsonInclude(Include.NON_NULL)
    private Hidenoka hidenoka;
    @JsonInclude(Include.NON_NULL)
    private List<Hidenoka> listhidenoka;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Agentdet> pageagentdet;
    @JsonInclude(Include.NON_NULL)
    private Agentdet agentdet;
    @JsonInclude(Include.NON_NULL)
    private List<Agentdet> listagentdet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Usersession> pageusersession;
    @JsonInclude(Include.NON_NULL)
    private Usersession usersession;
    @JsonInclude(Include.NON_NULL)
    private List<Usersession> listusersession;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Member> pagemember;
    @JsonInclude(Include.NON_NULL)
    private Member member;
    @JsonInclude(Include.NON_NULL)
    private List<Member> listmember;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Membertype> pagemembertype;
    @JsonInclude(Include.NON_NULL)
    private Membertype membertype;
    @JsonInclude(Include.NON_NULL)
    private List<Membertype> listmembertype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<MemMemtype> pagememmemtype;
    @JsonInclude(Include.NON_NULL)
    private MemMemtype memmemtype;
    @JsonInclude(Include.NON_NULL)
    private List<MemMemtype> listmemmemtype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Occupationtype> pageoccupationtype;
    @JsonInclude(Include.NON_NULL)
    private Occupationtype occupationtype;
    @JsonInclude(Include.NON_NULL)
    private List<Occupationtype> listoccupationtype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Serviceprovider> pageserviceprovider;
    @JsonInclude(Include.NON_NULL)
    private Serviceprovider serviceprovider;
    @JsonInclude(Include.NON_NULL)
    private List<Serviceprovider> listserviceprovider;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Service> pageservice;
    @JsonInclude(Include.NON_NULL)
    private Service service;
    @JsonInclude(Include.NON_NULL)
    private List<Service> listservice;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Parameter> pageparameter;
    @JsonInclude(Include.NON_NULL)
    private Parameter parameter;
    @JsonInclude(Include.NON_NULL)
    private List<Parameter> listparameter;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Schedule> pageschedule;
    @JsonInclude(Include.NON_NULL)
    private Schedule schedule;
    @JsonInclude(Include.NON_NULL)
    private List<Schedule> listschedule;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Stamformdet> pagestamformdet;
    @JsonInclude(Include.NON_NULL)
    private Stamformdet stamformdet;
    @JsonInclude(Include.NON_NULL)
    private List<Stamformdet> liststamformdet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Trip> pagetrip;
    @JsonInclude(Include.NON_NULL)
    private Trip trip;
    @JsonInclude(Include.NON_NULL)
    private List<Trip> listtrip;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Trainmiles> pagetrainmiles;
    @JsonInclude(Include.NON_NULL)
    private Trainmiles trainmiles;
    @JsonInclude(Include.NON_NULL)
    private List<Trainmiles> listtrainmiles;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Trainrunning> pagetrainrunning;
    @JsonInclude(Include.NON_NULL)
    private Trainrunning trainrunning;
    @JsonInclude(Include.NON_NULL)
    private List<Trainrunning> listtrainrunning;


    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Stop> pagestop;
    @JsonInclude(Include.NON_NULL)
    private Stop stop;
    @JsonInclude(Include.NON_NULL)
    private List<Stop> liststop;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Membership> pagemembership;
    @JsonInclude(Include.NON_NULL)
    private Membership membership;
    @JsonInclude(Include.NON_NULL)
    private List<Membership> listmembership;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<MemShiptype> pagememshiptype;
    @JsonInclude(Include.NON_NULL)
    private MemShiptype memshiptype;
    @JsonInclude(Include.NON_NULL)
    private List<MemShiptype> listmemshiptype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<MemShiptrans> pagememshiptrans;
    @JsonInclude(Include.NON_NULL)
    private MemShiptrans memshiptrans;
    @JsonInclude(Include.NON_NULL)
    private List<MemShiptrans> listmemshiptrans;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Reduction> pagereduction;
    @JsonInclude(Include.NON_NULL)
    private Reduction reduction;
    @JsonInclude(Include.NON_NULL)
    private List<Reduction> listreduction;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Reductionexcl> pagereductionexcl;
    @JsonInclude(Include.NON_NULL)
    private Reductionexcl reductionexcl;
    @JsonInclude(Include.NON_NULL)
    private List<Reductionexcl> listreductionexcls;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Allocdet> pageallocdet;
    @JsonInclude(Include.NON_NULL)
    private Allocdet allocdet;
    @JsonInclude(Include.NON_NULL)
    private List<Allocdet> listallocdet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Allocdetsubcl> pageallocdetsubcl;
    @JsonInclude(Include.NON_NULL)
    private Allocdetsubcl allocdetsubcl;
    @JsonInclude(Include.NON_NULL)
    private List<Allocdetsubcl> listallocdetsubcl;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Block> pageblock;
    @JsonInclude(Include.NON_NULL)
    private Block block;
    @JsonInclude(Include.NON_NULL)
    private List<Block> listblock;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Closing> pageclosing;
    @JsonInclude(Include.NON_NULL)
    private Closing closing;
    @JsonInclude(Include.NON_NULL)
    private List<Closing> listclosing;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Sapcoa> pagesapcoa;
    @JsonInclude(Include.NON_NULL)
    private Sapcoa sapcoa;
    @JsonInclude(Include.NON_NULL)
    private List<Sapcoa> listsapcoa;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Sapposting> pagesapposting;
    @JsonInclude(Include.NON_NULL)
    private Sapposting sapposting;
    @JsonInclude(Include.NON_NULL)
    private List<Sapposting> listsapposting;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Sapschedule> pagesapschedule;
    @JsonInclude(Include.NON_NULL)
    private Sapschedule sapschedule;
    @JsonInclude(Include.NON_NULL)
    private List<Sapschedule> listsapschedule;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Sapwagonclass> pagesapwagonclass;
    @JsonInclude(Include.NON_NULL)
    private Sapwagonclass sapwagonclass;
    @JsonInclude(Include.NON_NULL)
    private List<Sapwagonclass> listsapwagonclass;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Transaction> pagetransaction;
    @JsonInclude(Include.NON_NULL)
    private Transaction transaction;
    @JsonInclude(Include.NON_NULL)
    private List<Transaction> listtransaction;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Transactiondet> pagetransactiondet;
    @JsonInclude(Include.NON_NULL)
    private Transactiondet transactiondet;
    @JsonInclude(Include.NON_NULL)
    private List<Transactiondet> listtransactiondet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Transactionlog> pagetransactionlog;
    @JsonInclude(Include.NON_NULL)
    private Transactionlog transactionlog;
    @JsonInclude(Include.NON_NULL)
    private List<Transactionlog> listtransactionlog;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Transdetservice> pagetransdetservice;
    @JsonInclude(Include.NON_NULL)
    private Transdetservice transdetservice;
    @JsonInclude(Include.NON_NULL)
    private List<Transdetservice> listtransdetservice;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Activitylog> pageactivitylog;
    @JsonInclude(Include.NON_NULL)
    private Activitylog activitylog;
    @JsonInclude(Include.NON_NULL)
    private List<Activitylog> listactivitylog;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Seatlog> pageseatlog;
    @JsonInclude(Include.NON_NULL)
    private Seatlog seatlog;
    @JsonInclude(Include.NON_NULL)
    private List<Seatlog> listseatlog;

    @JsonInclude(Include.NON_NULL)
    private Auth auth;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Grpreservation> pagegrpreservation;
    @JsonInclude(Include.NON_NULL)
    private Grpreservation grpreservation;
    @JsonInclude(Include.NON_NULL)
    private List<Grpreservation> listgrpreservation;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Grpreservationdet> pagegrpreservationdet;
    @JsonInclude(Include.NON_NULL)
    private Grpreservationdet grpreservationdet;
    @JsonInclude(Include.NON_NULL)
    private List<Grpreservationdet> listgrpreservationdet;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Grpreservationpsg> pagegrpreservationpsg;
    @JsonInclude(Include.NON_NULL)
    private Grpreservationpsg grpreservationpsg;
    @JsonInclude(Include.NON_NULL)
    private List<Grpreservationpsg> listgrpreservationpsg;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Grpreservationpay> pagegrpreservationpay;
    @JsonInclude(Include.NON_NULL)
    private Grpreservationpay grpreservationpay;
    @JsonInclude(Include.NON_NULL)
    private List<Grpreservationpay> listgrpreservationpay;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Grpreservationsrv> pagegrpreservationsrv;
    @JsonInclude(Include.NON_NULL)
    private Grpreservationsrv grpreservationsrv;
    @JsonInclude(Include.NON_NULL)
    private List<Grpreservationsrv> listgrpreservationsrv;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Vouchertype> pagevouchertype;
    @JsonInclude(Include.NON_NULL)
    private Vouchertype vouchertype;
    @JsonInclude(Include.NON_NULL)
    private List<Vouchertype> listvouchertype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Voucheramount> pagevoucheramount;
    @JsonInclude(Include.NON_NULL)
    private Voucheramount voucheramount;
    @JsonInclude(Include.NON_NULL)
    private List<Voucheramount> listvoucheramount;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Voucher> pagevoucher;
    @JsonInclude(Include.NON_NULL)
    private Voucher voucher;
    @JsonInclude(Include.NON_NULL)
    private List<Voucher> listvoucher;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Dailyticket> pagedailyticket;
    @JsonInclude(Include.NON_NULL)
    private Dailyticket dailyticket;
    @JsonInclude(Include.NON_NULL)
    private List<Dailyticket> listdailyticket;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Pasepartu> pagepasepartu;
    @JsonInclude(Include.NON_NULL)
    private Pasepartu pasepartu;
    @JsonInclude(Include.NON_NULL)
    private List<Pasepartu> listpasepartu;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Suplisi> pagesuplisi;
    @JsonInclude(Include.NON_NULL)
    private Suplisi suplisi;
    @JsonInclude(Include.NON_NULL)
    private List<Suplisi> listsuplisi;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Baggage> pagebaggage;
    @JsonInclude(Include.NON_NULL)
    private Baggage baggage;
    @JsonInclude(Include.NON_NULL)
    private List<Baggage> listbaggage;    
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Baggagetrans> pagebaggagetrans;
    @JsonInclude(Include.NON_NULL)
    private Baggagetrans baggagetrans;
    @JsonInclude(Include.NON_NULL)
    private List<Baggagetrans> listbaggagetrans;       

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Compensation> pagecompensation;
    @JsonInclude(Include.NON_NULL)
    private Compensation compensation;
    @JsonInclude(Include.NON_NULL)
    private List<Compensation> listcompensation;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Refundupload> pagerefundupload;
    @JsonInclude(Include.NON_NULL)
    private Refundupload refundupload;
    @JsonInclude(Include.NON_NULL)
    private List<Refundupload> listrefundupload;    

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Cancellationtype> pagecancellationtype;
    @JsonInclude(Include.NON_NULL)
    private Cancellationtype cancellationtype;
    @JsonInclude(Include.NON_NULL)
    private List<Cancellationtype> listcancellationtype;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Cancellation> pagecancellation;
    @JsonInclude(Include.NON_NULL)
    private Cancellation cancellation;
    @JsonInclude(Include.NON_NULL)
    private List<Cancellation> listcancellation;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Cancellationdet> pagecancellationdet;
    @JsonInclude(Include.NON_NULL)
    private Cancellationdet cancellationdet;
    @JsonInclude(Include.NON_NULL)
    private List<Cancellationdet> listcancellationdet;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Cancelreason> pagecancelreason;
    @JsonInclude(Include.NON_NULL)
    private Cancelreason cancelreason;
    @JsonInclude(Include.NON_NULL)
    private List<Cancelreason> listcancelreason;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Refund> pagerefund;
    @JsonInclude(Include.NON_NULL)
    private Refund refund;
    @JsonInclude(Include.NON_NULL)
    private List<Refund> listrefund;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Availability> pageavailability;
    @JsonInclude(Include.NON_NULL)
    private Availability availability;
    @JsonInclude(Include.NON_NULL)
    private List<Availability> listavailability;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Seatmap> pageseatmap;
    @JsonInclude(Include.NON_NULL)
    private Seatmap seatmap;
    @JsonInclude(Include.NON_NULL)
    private List<Seatmap> listseatmap;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Discountsch> pagediscountsch;
    @JsonInclude(Include.NON_NULL)
    private Discountsch discountsch;
    @JsonInclude(Include.NON_NULL)
    private List<Discountsch> listdiscountsch;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Bookinfo> pagebookinfo;
    @JsonInclude(Include.NON_NULL)
    private Bookinfo bookinfo;
    @JsonInclude(Include.NON_NULL)
    private List<Bookinfo> listbookinfo;
    
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<AgentBalance> pageagentbalance;
    @JsonInclude(Include.NON_NULL)
    private AgentBalance agentbalance;
    @JsonInclude(Include.NON_NULL)
    private List<AgentBalance> listagentbalance;    
        
    @JsonInclude(Include.NON_NULL)
    private PageImplBean<Ticketnumber> pageticketnumber;
    @JsonInclude(Include.NON_NULL)
    private Ticketnumber ticketnumber;
    @JsonInclude(Include.NON_NULL)
    private List<Ticketnumber> listticketnumber;

    @JsonInclude(Include.NON_NULL)
    private PageImplBean<AgentTrans> pageagenttrans;
    @JsonInclude(Include.NON_NULL)
    private AgentTrans agenttrans;
    @JsonInclude(Include.NON_NULL)
    private List<AgentTrans> listagenttrans;

    //----------------Model & List Model From Trainplan -------------------------------------------//
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Daop> pagedaop;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Daop daop;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Daop> listdaop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Tabstn> pagetabstn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Tabstn tabstn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Tabstn> listtabstn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Ka> pageka;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Ka ka;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Ka> listka;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Gapeka> pagegapeka;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Gapeka gapeka;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Gapeka> listgapeka;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Rtsngtglkajalanpnpall> pagertsngtglkajalanpnpall;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Rtsngtglkajalanpnpall rtsngtglkajalanpnpall;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Rtsngtglkajalanpnpall> listrtsngtglkajalanpnpall;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Rtsngtglkajalanpnpstop> pagertsngtglkajalanpnpstop;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Rtsngtglkajalanpnpstop rtsngtglkajalanpnpstop;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Rtsngtglkajalanpnpstop> listrtsngtglkajalanpnpstop;
    //---------------------End Model & List Model From Trainplan-------------------------------------------------------//

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Title> pagetitle;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Title title;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Title> listtitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Mappingunit> pagemapingunit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Mappingunit mapingunit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Mappingunit> listmapingunit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Checkin> pagecheckin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Checkin checkin;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Checkin> listcheckin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Ticketsaleoffset> pageticketsaleoffset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Ticketsaleoffset ticketsaleoffset;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Ticketsaleoffset> listticketsaleoffset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Tripschedule> pagetripschedule;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Tripschedule tripschedule;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Tripschedule> listtripschedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Redeeminfo> pageredeeminfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Redeeminfo redeeminfo;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Redeeminfo> listredeeminfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String transactionId;

    @JsonInclude(Include.NON_NULL)
    private String infantRateId;

    @JsonInclude(Include.NON_NULL)
    private Integer infantTotAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Okupansi> pageokupansi;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Okupansi okupansi;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Okupansi> listokupansi;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PageImplBean<Penjunit> pagepenjunit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Penjunit penjunit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Penjunit> listpenjunit;
//----------------------------------------------------------------------------//

    public ResponseResource() {
    }

    public ResponseResource(String err_code, String msg) {
        this.err_code = err_code;
        this.msg = msg;
    }

    public String getErr_code() {
        return err_code;
    }

    public void setErr_code(String err_code) {
        this.err_code = err_code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public PageImplBean<Domain> getPagedomain() {
        return pagedomain;
    }

    public void setPagedomain(PageImplBean<Domain> pagedomain) {
        this.pagedomain = pagedomain;
    }

    public Domain getDomain() {
        return domain;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public List<Domain> getListdomain() {
        return listdomain;
    }

    public void setListdomain(List<Domain> listdomain) {
        this.listdomain = listdomain;
    }

    public PageImplBean<Area> getPagearea() {
        return pagearea;
    }

    public void setPagearea(PageImplBean<Area> pagearea) {
        this.pagearea = pagearea;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public List<Area> getListarea() {
        return listarea;
    }

    public void setListarea(List<Area> listarea) {
        this.listarea = listarea;
    }

    public PageImplBean<Stasiun> getPagestasiun() {
        return pagestasiun;
    }

    public void setPagestasiun(PageImplBean<Stasiun> pagestasiun) {
        this.pagestasiun = pagestasiun;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public List<Stasiun> getListstasiun() {
        return liststasiun;
    }

    public void setListstasiun(List<Stasiun> liststasiun) {
        this.liststasiun = liststasiun;
    }

    public PageImplBean<Channel> getPagechannel() {
        return pagechannel;
    }

    public void setPagechannel(PageImplBean<Channel> pagechannel) {
        this.pagechannel = pagechannel;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public List<Channel> getListchannel() {
        return listchannel;
    }

    public void setListchannel(List<Channel> listchannel) {
        this.listchannel = listchannel;
    }

    public PageImplBean<Unit> getPageunit() {
        return pageunit;
    }

    public void setPageunit(PageImplBean<Unit> pageunit) {
        this.pageunit = pageunit;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Unit> getListunit() {
        return listunit;
    }

    public void setListunit(List<Unit> listunit) {
        this.listunit = listunit;
    }

    public PageImplBean<IpUnit> getPageipunit() {
        return pageipunit;
    }

    public void setPageipunit(PageImplBean<IpUnit> pageipunit) {
        this.pageipunit = pageipunit;
    }

    public IpUnit getIpunit() {
        return ipunit;
    }

    public void setIpunit(IpUnit ipunit) {
        this.ipunit = ipunit;
    }

    public List<IpUnit> getListipunit() {
        return listipunit;
    }

    public void setListipunit(List<IpUnit> listipunit) {
        this.listipunit = listipunit;
    }

    public PageImplBean<Ip> getPageip() {
        return pageip;
    }

    public void setPageip(PageImplBean<Ip> pageip) {
        this.pageip = pageip;
    }

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public List<Ip> getListip() {
        return listip;
    }

    public void setListip(List<Ip> listip) {
        this.listip = listip;
    }

    public PageImplBean<Traintype> getPagetraintype() {
        return pagetraintype;
    }

    public void setPagetraintype(PageImplBean<Traintype> pagetraintype) {
        this.pagetraintype = pagetraintype;
    }

    public Traintype getTraintype() {
        return traintype;
    }

    public void setTraintype(Traintype traintype) {
        this.traintype = traintype;
    }

    public List<Traintype> getListtraintype() {
        return listtraintype;
    }

    public void setListtraintype(List<Traintype> listtraintype) {
        this.listtraintype = listtraintype;
    }

    public PageImplBean<Train> getPagetrain() {
        return pagetrain;
    }

    public void setPagetrain(PageImplBean<Train> pagetrain) {
        this.pagetrain = pagetrain;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public List<Train> getListtrain() {
        return listtrain;
    }

    public void setListtrain(List<Train> listtrain) {
        this.listtrain = listtrain;
    }

    public PageImplBean<Subclass> getPagesubclass() {
        return pagesubclass;
    }

    public void setPagesubclass(PageImplBean<Subclass> pagesubclass) {
        this.pagesubclass = pagesubclass;
    }

    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    public List<Subclass> getListsubclass() {
        return listsubclass;
    }

    public void setListsubclass(List<Subclass> listsubclass) {
        this.listsubclass = listsubclass;
    }

    public PageImplBean<Province> getPageprovince() {
        return pageprovince;
    }

    public void setPageprovince(PageImplBean<Province> pageprovince) {
        this.pageprovince = pageprovince;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public List<Province> getListprovince() {
        return listprovince;
    }

    public void setListprovince(List<Province> listprovince) {
        this.listprovince = listprovince;
    }

    public PageImplBean<City> getPagecity() {
        return pagecity;
    }

    public void setPagecity(PageImplBean<City> pagecity) {
        this.pagecity = pagecity;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<City> getListcity() {
        return listcity;
    }

    public void setListcity(List<City> listcity) {
        this.listcity = listcity;
    }

    public PageImplBean<Moduletype> getPagemoduletype() {
        return pagemoduletype;
    }

    public void setPagemoduletype(PageImplBean<Moduletype> pagemoduletype) {
        this.pagemoduletype = pagemoduletype;
    }

    public Moduletype getModuletype() {
        return moduletype;
    }

    public void setModuletype(Moduletype moduletype) {
        this.moduletype = moduletype;
    }

    public List<Moduletype> getListmoduletype() {
        return listmoduletype;
    }

    public void setListmoduletype(List<Moduletype> listmoduletype) {
        this.listmoduletype = listmoduletype;
    }

    public PageImplBean<Module> getPagemodule() {
        return pagemodule;
    }

    public void setPagemodule(PageImplBean<Module> pagemodule) {
        this.pagemodule = pagemodule;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public List<Module> getListmodule() {
        return listmodule;
    }

    public void setListmodule(List<Module> listmodule) {
        this.listmodule = listmodule;
    }

    public PageImplBean<Objactivity> getPageobjactivity() {
        return pageobjactivity;
    }

    public void setPageobjactivity(PageImplBean<Objactivity> pageobjactivity) {
        this.pageobjactivity = pageobjactivity;
    }

    public Objactivity getObjactivity() {
        return objactivity;
    }

    public void setObjactivity(Objactivity objactivity) {
        this.objactivity = objactivity;
    }

    public List<Objactivity> getListobjactivity() {
        return listobjactivity;
    }

    public void setListobjactivity(List<Objactivity> listobjactivity) {
        this.listobjactivity = listobjactivity;
    }

    public PageImplBean<Usergroup> getPageusergroup() {
        return pageusergroup;
    }

    public void setPageusergroup(PageImplBean<Usergroup> pageusergroup) {
        this.pageusergroup = pageusergroup;
    }

    public Usergroup getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(Usergroup usergroup) {
        this.usergroup = usergroup;
    }

    public List<Usergroup> getListusergroup() {
        return listusergroup;
    }

    public void setListusergroup(List<Usergroup> listusergroup) {
        this.listusergroup = listusergroup;
    }

    public PageImplBean<Usertype> getPageusertype() {
        return pageusertype;
    }

    public void setPageusertype(PageImplBean<Usertype> pageusertype) {
        this.pageusertype = pageusertype;
    }

    public Usertype getUsertype() {
        return usertype;
    }

    public void setUsertype(Usertype usertype) {
        this.usertype = usertype;
    }

    public List<Usertype> getListusertype() {
        return listusertype;
    }

    public void setListusertype(List<Usertype> listusertype) {
        this.listusertype = listusertype;
    }

    public PageImplBean<Userpass> getPageuserpass() {
        return pageuserpass;
    }

    public void setPageuserpass(PageImplBean<Userpass> pageuserpass) {
        this.pageuserpass = pageuserpass;
    }

    public Userpass getUserpass() {
        return userpass;
    }

    public void setUserpass(Userpass userpass) {
        this.userpass = userpass;
    }

    public List<Userpass> getListuserpass() {
        return listuserpass;
    }

    public void setListuserpass(List<Userpass> listuserpass) {
        this.listuserpass = listuserpass;
    }

    public PageImplBean<User> getPageuser() {
        return pageuser;
    }

    public void setPageuser(PageImplBean<User> pageuser) {
        this.pageuser = pageuser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getListuser() {
        return listuser;
    }

    public void setListuser(List<User> listuser) {
        this.listuser = listuser;
    }

    public PageImplBean<UnitUser> getPageunituser() {
        return pageunituser;
    }

    public void setPageunituser(PageImplBean<UnitUser> pageunituser) {
        this.pageunituser = pageunituser;
    }

    public UnitUser getUnituser() {
        return unituser;
    }

    public void setUnituser(UnitUser unituser) {
        this.unituser = unituser;
    }

    public List<UnitUser> getListunituser() {
        return listunituser;
    }

    public void setListunituser(List<UnitUser> listunituser) {
        this.listunituser = listunituser;
    }

    public PageImplBean<Bank> getPagebank() {
        return pagebank;
    }

    public void setPagebank(PageImplBean<Bank> pagebank) {
        this.pagebank = pagebank;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<Bank> getListbank() {
        return listbank;
    }

    public void setListbank(List<Bank> listbank) {
        this.listbank = listbank;
    }

    public PageImplBean<Paytype> getPagepaytype() {
        return pagepaytype;
    }

    public void setPagepaytype(PageImplBean<Paytype> pagepaytype) {
        this.pagepaytype = pagepaytype;
    }

    public Paytype getPaytype() {
        return paytype;
    }

    public void setPaytype(Paytype paytype) {
        this.paytype = paytype;
    }

    public List<Paytype> getListpaytype() {
        return listpaytype;
    }

    public void setListpaytype(List<Paytype> listpaytype) {
        this.listpaytype = listpaytype;
    }

    public PageImplBean<ChannelPaytype> getPagechannelpaytype() {
        return pagechannelpaytype;
    }

    public void setPagechannelpaytype(PageImplBean<ChannelPaytype> pagechannelpaytype) {
        this.pagechannelpaytype = pagechannelpaytype;
    }

    public ChannelPaytype getChannelpaytype() {
        return channelpaytype;
    }

    public void setChannelpaytype(ChannelPaytype channelpaytype) {
        this.channelpaytype = channelpaytype;
    }

    public List<ChannelPaytype> getListchannelpaytype() {
        return listchannelpaytype;
    }

    public void setListchannelpaytype(List<ChannelPaytype> listchannelpaytype) {
        this.listchannelpaytype = listchannelpaytype;
    }

    public PageImplBean<Stdistance> getPagestdistance() {
        return pagestdistance;
    }

    public void setPagestdistance(PageImplBean<Stdistance> pagestdistance) {
        this.pagestdistance = pagestdistance;
    }

    public Stdistance getStdistance() {
        return stdistance;
    }

    public void setStdistance(Stdistance stdistance) {
        this.stdistance = stdistance;
    }

    public List<Stdistance> getListstdistance() {
        return liststdistance;
    }

    public void setListstdistance(List<Stdistance> liststdistance) {
        this.liststdistance = liststdistance;
    }

    public PageImplBean<Privileges> getPageprivileges() {
        return pageprivileges;
    }

    public void setPageprivileges(PageImplBean<Privileges> pageprivileges) {
        this.pageprivileges = pageprivileges;
    }

    public Privileges getPrivileges() {
        return privileges;
    }

    public void setPrivileges(Privileges privileges) {
        this.privileges = privileges;
    }

    public List<Privileges> getListprivileges() {
        return listprivileges;
    }

    public void setListprivileges(List<Privileges> listprivileges) {
        this.listprivileges = listprivileges;
    }

    public PageImplBean<Announcement> getPageannouncement() {
        return pageannouncement;
    }

    public void setPageannouncement(PageImplBean<Announcement> pageannouncement) {
        this.pageannouncement = pageannouncement;
    }

    public Announcement getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Announcement announcement) {
        this.announcement = announcement;
    }

    public List<Announcement> getListannouncement() {
        return listannouncement;
    }

    public void setListannouncement(List<Announcement> listannouncement) {
        this.listannouncement = listannouncement;
    }

    public PageImplBean<Message> getPagemessage() {
        return pagemessage;
    }

    public void setPagemessage(PageImplBean<Message> pagemessage) {
        this.pagemessage = pagemessage;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Message> getListmessage() {
        return listmessage;
    }

    public void setListmessage(List<Message> listmessage) {
        this.listmessage = listmessage;
    }

    public PageImplBean<Msgto> getPagemsgto() {
        return pagemsgto;
    }

    public void setPagemsgto(PageImplBean<Msgto> pagemsgto) {
        this.pagemsgto = pagemsgto;
    }

    public Msgto getMsgto() {
        return msgto;
    }

    public void setMsgto(Msgto msgto) {
        this.msgto = msgto;
    }

    public List<Msgto> getListmsgto() {
        return listmsgto;
    }

    public void setListmsgto(List<Msgto> listmsgto) {
        this.listmsgto = listmsgto;
    }

    public PageImplBean<Msgattc> getPagemsgattc() {
        return pagemsgattc;
    }

    public void setPagemsgattc(PageImplBean<Msgattc> pagemsgattc) {
        this.pagemsgattc = pagemsgattc;
    }

    public Msgattc getMsgattc() {
        return msgattc;
    }

    public void setMsgattc(Msgattc msgattc) {
        this.msgattc = msgattc;
    }

    public List<Msgattc> getListmsgattc() {
        return listmsgattc;
    }

    public void setListmsgattc(List<Msgattc> listmsgattc) {
        this.listmsgattc = listmsgattc;
    }

    public PageImplBean<Holiday> getPageholiday() {
        return pageholiday;
    }

    public void setPageholiday(PageImplBean<Holiday> pageholiday) {
        this.pageholiday = pageholiday;
    }

    public Holiday getHoliday() {
        return holiday;
    }

    public void setHoliday(Holiday holiday) {
        this.holiday = holiday;
    }

    public List<Holiday> getListholiday() {
        return listholiday;
    }

    public void setListholiday(List<Holiday> listholiday) {
        this.listholiday = listholiday;
    }

    public PageImplBean<Shift> getPageshift() {
        return pageshift;
    }

    public void setPageshift(PageImplBean<Shift> pageshift) {
        this.pageshift = pageshift;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public List<Shift> getListshift() {
        return listshift;
    }

    public void setListshift(List<Shift> listshift) {
        this.listshift = listshift;
    }

    public PageImplBean<Unitfee> getPageunitfee() {
        return pageunitfee;
    }

    public void setPageunitfee(PageImplBean<Unitfee> pageunitfee) {
        this.pageunitfee = pageunitfee;
    }

    public Unitfee getUnitfee() {
        return unitfee;
    }

    public void setUnitfee(Unitfee unitfee) {
        this.unitfee = unitfee;
    }

    public List<Unitfee> getListunitfee() {
        return listunitfee;
    }

    public void setListunitfee(List<Unitfee> listunitfee) {
        this.listunitfee = listunitfee;
    }

    public PageImplBean<Hidenoka> getPagehidenoka() {
        return pagehidenoka;
    }

    public void setPagehidenoka(PageImplBean<Hidenoka> pagehidenoka) {
        this.pagehidenoka = pagehidenoka;
    }

    public Hidenoka getHidenoka() {
        return hidenoka;
    }

    public void setHidenoka(Hidenoka hidenoka) {
        this.hidenoka = hidenoka;
    }

    public List<Hidenoka> getListhidenoka() {
        return listhidenoka;
    }

    public void setListhidenoka(List<Hidenoka> listhidenoka) {
        this.listhidenoka = listhidenoka;
    }

    public PageImplBean<Agentdet> getPageagentdet() {
        return pageagentdet;
    }

    public void setPageagentdet(PageImplBean<Agentdet> pageagentdet) {
        this.pageagentdet = pageagentdet;
    }

    public Agentdet getAgentdet() {
        return agentdet;
    }

    public void setAgentdet(Agentdet agentdet) {
        this.agentdet = agentdet;
    }

    public List<Agentdet> getListagentdet() {
        return listagentdet;
    }

    public void setListagentdet(List<Agentdet> listagentdet) {
        this.listagentdet = listagentdet;
    }

    public PageImplBean<Usersession> getPageusersession() {
        return pageusersession;
    }

    public void setPageusersession(PageImplBean<Usersession> pageusersession) {
        this.pageusersession = pageusersession;
    }

    public Usersession getUsersession() {
        return usersession;
    }

    public void setUsersession(Usersession usersession) {
        this.usersession = usersession;
    }

    public List<Usersession> getListusersession() {
        return listusersession;
    }

    public void setListusersession(List<Usersession> listusersession) {
        this.listusersession = listusersession;
    }

    public PageImplBean<Wagonclass> getPagewagonclass() {
        return pagewagonclass;
    }

    public void setPagewagonclass(PageImplBean<Wagonclass> pagewagonclass) {
        this.pagewagonclass = pagewagonclass;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public List<Wagonclass> getListwagonclass() {
        return listwagonclass;
    }

    public void setListwagonclass(List<Wagonclass> listwagonclass) {
        this.listwagonclass = listwagonclass;
    }

    public PageImplBean<Wagon> getPagewagon() {
        return pagewagon;
    }

    public void setPagewagon(PageImplBean<Wagon> pagewagon) {
        this.pagewagon = pagewagon;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    }

    public List<Wagon> getListwagon() {
        return listwagon;
    }

    public void setListwagon(List<Wagon> listwagon) {
        this.listwagon = listwagon;
    }

    public PageImplBean<Wagondet> getPagewagondet() {
        return pagewagondet;
    }

    public void setPagewagondet(PageImplBean<Wagondet> pagewagondet) {
        this.pagewagondet = pagewagondet;
    }

    public Wagondet getWagondet() {
        return wagondet;
    }

    public void setWagondet(Wagondet wagondet) {
        this.wagondet = wagondet;
    }

    public List<Wagondet> getListwagondet() {
        return listwagondet;
    }

    public void setListwagondet(List<Wagondet> listwagondet) {
        this.listwagondet = listwagondet;
    }

    public PageImplBean<Member> getPagemember() {
        return pagemember;
    }

    public void setPagemember(PageImplBean<Member> pagemember) {
        this.pagemember = pagemember;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public List<Member> getListmember() {
        return listmember;
    }

    public void setListmember(List<Member> listmember) {
        this.listmember = listmember;
    }

    public PageImplBean<Membertype> getPagemembertype() {
        return pagemembertype;
    }

    public void setPagemembertype(PageImplBean<Membertype> pagemembertype) {
        this.pagemembertype = pagemembertype;
    }

    public Membertype getMembertype() {
        return membertype;
    }

    public void setMembertype(Membertype membertype) {
        this.membertype = membertype;
    }

    public List<Membertype> getListmembertype() {
        return listmembertype;
    }

    public void setListmembertype(List<Membertype> listmembertype) {
        this.listmembertype = listmembertype;
    }

    public PageImplBean<MemMemtype> getPagememmemtype() {
        return pagememmemtype;
    }

    public void setPagememmemtype(PageImplBean<MemMemtype> pagememmemtype) {
        this.pagememmemtype = pagememmemtype;
    }

    public MemMemtype getMemmemtype() {
        return memmemtype;
    }

    public void setMemmemtype(MemMemtype memmemtype) {
        this.memmemtype = memmemtype;
    }

    public List<MemMemtype> getListmemmemtype() {
        return listmemmemtype;
    }

    public void setListmemmemtype(List<MemMemtype> listmemmemtype) {
        this.listmemmemtype = listmemmemtype;
    }

    public PageImplBean<Serviceprovider> getPageserviceprovider() {
        return pageserviceprovider;
    }

    public void setPageserviceprovider(PageImplBean<Serviceprovider> pageserviceprovider) {
        this.pageserviceprovider = pageserviceprovider;
    }

    public Serviceprovider getServiceprovider() {
        return serviceprovider;
    }

    public void setServiceprovider(Serviceprovider serviceprovider) {
        this.serviceprovider = serviceprovider;
    }

    public List<Serviceprovider> getListserviceprovider() {
        return listserviceprovider;
    }

    public void setListserviceprovider(List<Serviceprovider> listserviceprovider) {
        this.listserviceprovider = listserviceprovider;
    }

    public PageImplBean<Service> getPageservice() {
        return pageservice;
    }

    public void setPageservice(PageImplBean<Service> pageservice) {
        this.pageservice = pageservice;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public List<Service> getListservice() {
        return listservice;
    }

    public void setListservice(List<Service> listservice) {
        this.listservice = listservice;
    }

    public PageImplBean<Parameter> getPageparameter() {
        return pageparameter;
    }

    public void setPageparameter(PageImplBean<Parameter> pageparameter) {
        this.pageparameter = pageparameter;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public List<Parameter> getListparameter() {
        return listparameter;
    }

    public void setListparameter(List<Parameter> listparameter) {
        this.listparameter = listparameter;
    }

    public PageImplBean<Schedule> getPageschedule() {
        return pageschedule;
    }

    public void setPageschedule(PageImplBean<Schedule> pageschedule) {
        this.pageschedule = pageschedule;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Schedule> getListschedule() {
        return listschedule;
    }

    public void setListschedule(List<Schedule> listschedule) {
        this.listschedule = listschedule;
    }

    public PageImplBean<Stamformdet> getPagestamformdet() {
        return pagestamformdet;
    }

    public void setPagestamformdet(PageImplBean<Stamformdet> pagestamformdet) {
        this.pagestamformdet = pagestamformdet;
    }

    public Stamformdet getStamformdet() {
        return stamformdet;
    }

    public void setStamformdet(Stamformdet stamformdet) {
        this.stamformdet = stamformdet;
    }

    public List<Stamformdet> getListstamformdet() {
        return liststamformdet;
    }

    public void setListstamformdet(List<Stamformdet> liststamformdet) {
        this.liststamformdet = liststamformdet;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public PageImplBean<Trip> getPagetrip() {
        return pagetrip;
    }

    public void setPagetrip(PageImplBean<Trip> pagetrip) {
        this.pagetrip = pagetrip;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public List<Trip> getListtrip() {
        return listtrip;
    }

    public void setListtrip(List<Trip> listtrip) {
        this.listtrip = listtrip;
    }

    public PageImplBean<Trainmiles> getPagetrainmiles() {
        return pagetrainmiles;
    }

    public void setPagetrainmiles(PageImplBean<Trainmiles> pagetrainmiles) {
        this.pagetrainmiles = pagetrainmiles;
    }

    public Trainmiles getTrainmiles() {
        return trainmiles;
    }

    public void setTrainmiles(Trainmiles trainmiles) {
        this.trainmiles = trainmiles;
    }

    public List<Trainmiles> getListtrainmiles() {
        return listtrainmiles;
    }

    public void setListtrainmiles(List<Trainmiles> listtrainmiles) {
        this.listtrainmiles = listtrainmiles;
    }

    public PageImplBean<Rate> getPagerate() {
        return pagerate;
    }

    public void setPagerate(PageImplBean<Rate> pagerate) {
        this.pagerate = pagerate;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public List<Rate> getListrate() {
        return listrate;
    }

    public void setListrate(List<Rate> listrate) {
        this.listrate = listrate;
    }

    public PageImplBean<Ratetype> getPageratetype() {
        return pageratetype;
    }

    public void setPageratetype(PageImplBean<Ratetype> pageratetype) {
        this.pageratetype = pageratetype;
    }

    public Ratetype getRatetype() {
        return ratetype;
    }

    public void setRatetype(Ratetype ratetype) {
        this.ratetype = ratetype;
    }

    public List<Ratetype> getListratetype() {
        return listratetype;
    }

    public void setListratetype(List<Ratetype> listratetype) {
        this.listratetype = listratetype;
    }

    public PageImplBean<Ratedetail> getPageratedetail() {
        return pageratedetail;
    }

    public void setPageratedetail(PageImplBean<Ratedetail> pageratedetail) {
        this.pageratedetail = pageratedetail;
    }

    public Ratedetail getRatedetail() {
        return ratedetail;
    }

    public void setRatedetail(Ratedetail ratedetail) {
        this.ratedetail = ratedetail;
    }

    public List<Ratedetail> getListratedetail() {
        return listratedetail;
    }

    public void setListratedetail(List<Ratedetail> listratedetail) {
        this.listratedetail = listratedetail;
    }

    public PageImplBean<Stop> getPagestop() {
        return pagestop;
    }

    public void setPagestop(PageImplBean<Stop> pagestop) {
        this.pagestop = pagestop;
    }

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public List<Stop> getListstop() {
        return liststop;
    }

    public void setListstop(List<Stop> liststop) {
        this.liststop = liststop;
    }

    public PageImplBean<Membership> getPagemembership() {
        return pagemembership;
    }

    public void setPagemembership(PageImplBean<Membership> pagemembership) {
        this.pagemembership = pagemembership;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public List<Membership> getListmembership() {
        return listmembership;
    }

    public void setListmembership(List<Membership> listmembership) {
        this.listmembership = listmembership;
    }

    public PageImplBean<MemShiptype> getPagememshiptype() {
        return pagememshiptype;
    }

    public void setPagememshiptype(PageImplBean<MemShiptype> pagememshiptype) {
        this.pagememshiptype = pagememshiptype;
    }

    public MemShiptype getMemshiptype() {
        return memshiptype;
    }

    public void setMemshiptype(MemShiptype memshiptype) {
        this.memshiptype = memshiptype;
    }

    public List<MemShiptype> getListmemshiptype() {
        return listmemshiptype;
    }

    public void setListmemshiptype(List<MemShiptype> listmemshiptype) {
        this.listmemshiptype = listmemshiptype;
    }

    public PageImplBean<MemShiptrans> getPagememshiptrans() {
        return pagememshiptrans;
    }

    public void setPagememshiptrans(PageImplBean<MemShiptrans> pagememshiptrans) {
        this.pagememshiptrans = pagememshiptrans;
    }

    public MemShiptrans getMemshiptrans() {
        return memshiptrans;
    }

    public void setMemshiptrans(MemShiptrans memshiptrans) {
        this.memshiptrans = memshiptrans;
    }

    public List<MemShiptrans> getListmemshiptrans() {
        return listmemshiptrans;
    }

    public void setListmemshiptrans(List<MemShiptrans> listmemshiptrans) {
        this.listmemshiptrans = listmemshiptrans;
    }

    public PageImplBean<Trainrunning> getPagetrainrunning() {
        return pagetrainrunning;
    }

    public void setPagetrainrunning(PageImplBean<Trainrunning> pagetrainrunning) {
        this.pagetrainrunning = pagetrainrunning;
    }

    public Trainrunning getTrainrunning() {
        return trainrunning;
    }

    public void setTrainrunning(Trainrunning trainrunning) {
        this.trainrunning = trainrunning;
    }

    public List<Trainrunning> getListtrainrunning() {
        return listtrainrunning;
    }

    public void setListtrainrunning(List<Trainrunning> listtrainrunning) {
        this.listtrainrunning = listtrainrunning;
    }

    public PageImplBean<Reduction> getPagereduction() {
        return pagereduction;
    }

    public void setPagereduction(PageImplBean<Reduction> pagereduction) {
        this.pagereduction = pagereduction;
    }

    public Reduction getReduction() {
        return reduction;
    }

    public void setReduction(Reduction reduction) {
        this.reduction = reduction;
    }

    public List<Reduction> getListreduction() {
        return listreduction;
    }

    public void setListreduction(List<Reduction> listreduction) {
        this.listreduction = listreduction;
    }

    public PageImplBean<Reductionexcl> getPagereductionexcl() {
        return pagereductionexcl;
    }

    public void setPagereductionexcl(PageImplBean<Reductionexcl> pagereductionexcl) {
        this.pagereductionexcl = pagereductionexcl;
    }

    public Reductionexcl getReductionexcl() {
        return reductionexcl;
    }

    public void setReductionexcl(Reductionexcl reductionexcl) {
        this.reductionexcl = reductionexcl;
    }

    public List<Reductionexcl> getListreductionexcls() {
        return listreductionexcls;
    }

    public void setListreductionexcls(List<Reductionexcl> listreductionexcls) {
        this.listreductionexcls = listreductionexcls;
    }

    public PageImplBean<Discounttype> getPagediscounttype() {
        return pagediscounttype;
    }

    public void setPagediscounttype(PageImplBean<Discounttype> pagediscounttype) {
        this.pagediscounttype = pagediscounttype;
    }

    public Discounttype getDiscounttype() {
        return discounttype;
    }

    public void setDiscounttype(Discounttype discounttype) {
        this.discounttype = discounttype;
    }

    public List<Discounttype> getListdiscounttype() {
        return listdiscounttype;
    }

    public void setListdiscounttype(List<Discounttype> listdiscounttype) {
        this.listdiscounttype = listdiscounttype;
    }

    public PageImplBean<Discount> getPagediscount() {
        return pagediscount;
    }

    public void setPagediscount(PageImplBean<Discount> pagediscount) {
        this.pagediscount = pagediscount;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public List<Discount> getListdiscount() {
        return listdiscount;
    }

    public void setListdiscount(List<Discount> listdiscount) {
        this.listdiscount = listdiscount;
    }

    public PageImplBean<Discountunit> getPagediscountunit() {
        return pagediscountunit;
    }

    public void setPagediscountunit(PageImplBean<Discountunit> pagediscountunit) {
        this.pagediscountunit = pagediscountunit;
    }

    public Discountunit getDiscountunit() {
        return discountunit;
    }

    public void setDiscountunit(Discountunit discountunit) {
        this.discountunit = discountunit;
    }

    public List<Discountunit> getListdiscountunit() {
        return listdiscountunit;
    }

    public void setListdiscountunit(List<Discountunit> listdiscountunit) {
        this.listdiscountunit = listdiscountunit;
    }

    public PageImplBean<Allocdet> getPageallocdet() {
        return pageallocdet;
    }

    public void setPageallocdet(PageImplBean<Allocdet> pageallocdet) {
        this.pageallocdet = pageallocdet;
    }

    public Allocdet getAllocdet() {
        return allocdet;
    }

    public void setAllocdet(Allocdet allocdet) {
        this.allocdet = allocdet;
    }

    public List<Allocdet> getListallocdet() {
        return listallocdet;
    }

    public void setListallocdet(List<Allocdet> listallocdet) {
        this.listallocdet = listallocdet;
    }

    public PageImplBean<Allocdetsubcl> getPageallocdetsubcl() {
        return pageallocdetsubcl;
    }

    public void setPageallocdetsubcl(PageImplBean<Allocdetsubcl> pageallocdetsubcl) {
        this.pageallocdetsubcl = pageallocdetsubcl;
    }

    public Allocdetsubcl getAllocdetsubcl() {
        return allocdetsubcl;
    }

    public void setAllocdetsubcl(Allocdetsubcl allocdetsubcl) {
        this.allocdetsubcl = allocdetsubcl;
    }

    public List<Allocdetsubcl> getListallocdetsubcl() {
        return listallocdetsubcl;
    }

    public void setListallocdetsubcl(List<Allocdetsubcl> listallocdetsubcl) {
        this.listallocdetsubcl = listallocdetsubcl;
    }

    public PageImplBean<Block> getPageblock() {
        return pageblock;
    }

    public void setPageblock(PageImplBean<Block> pageblock) {
        this.pageblock = pageblock;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public List<Block> getListblock() {
        return listblock;
    }

    public void setListblock(List<Block> listblock) {
        this.listblock = listblock;
    }

    public PageImplBean<Closing> getPageclosing() {
        return pageclosing;
    }

    public void setPageclosing(PageImplBean<Closing> pageclosing) {
        this.pageclosing = pageclosing;
    }

    public Closing getClosing() {
        return closing;
    }

    public void setClosing(Closing closing) {
        this.closing = closing;
    }

    public List<Closing> getListclosing() {
        return listclosing;
    }

    public void setListclosing(List<Closing> listclosing) {
        this.listclosing = listclosing;
    }

    public PageImplBean<Sapcoa> getPagesapcoa() {
        return pagesapcoa;
    }

    public void setPagesapcoa(PageImplBean<Sapcoa> pagesapcoa) {
        this.pagesapcoa = pagesapcoa;
    }

    public Sapcoa getSapcoa() {
        return sapcoa;
    }

    public void setSapcoa(Sapcoa sapcoa) {
        this.sapcoa = sapcoa;
    }

    public List<Sapcoa> getListsapcoa() {
        return listsapcoa;
    }

    public void setListsapcoa(List<Sapcoa> listsapcoa) {
        this.listsapcoa = listsapcoa;
    }

    public PageImplBean<Sapposting> getPagesapposting() {
        return pagesapposting;
    }

    public void setPagesapposting(PageImplBean<Sapposting> pagesapposting) {
        this.pagesapposting = pagesapposting;
    }

    public Sapposting getSapposting() {
        return sapposting;
    }

    public void setSapposting(Sapposting sapposting) {
        this.sapposting = sapposting;
    }

    public List<Sapposting> getListsapposting() {
        return listsapposting;
    }

    public void setListsapposting(List<Sapposting> listsapposting) {
        this.listsapposting = listsapposting;
    }

    public PageImplBean<Sapschedule> getPagesapschedule() {
        return pagesapschedule;
    }

    public void setPagesapschedule(PageImplBean<Sapschedule> pagesapschedule) {
        this.pagesapschedule = pagesapschedule;
    }

    public Sapschedule getSapschedule() {
        return sapschedule;
    }

    public void setSapschedule(Sapschedule sapschedule) {
        this.sapschedule = sapschedule;
    }

    public List<Sapschedule> getListsapschedule() {
        return listsapschedule;
    }

    public void setListsapschedule(List<Sapschedule> listsapschedule) {
        this.listsapschedule = listsapschedule;
    }

    public PageImplBean<Sapwagonclass> getPagesapwagonclass() {
        return pagesapwagonclass;
    }

    public void setPagesapwagonclass(PageImplBean<Sapwagonclass> pagesapwagonclass) {
        this.pagesapwagonclass = pagesapwagonclass;
    }

    public Sapwagonclass getSapwagonclass() {
        return sapwagonclass;
    }

    public void setSapwagonclass(Sapwagonclass sapwagonclass) {
        this.sapwagonclass = sapwagonclass;
    }

    public List<Sapwagonclass> getListsapwagonclass() {
        return listsapwagonclass;
    }

    public void setListsapwagonclass(List<Sapwagonclass> listsapwagonclass) {
        this.listsapwagonclass = listsapwagonclass;
    }

    public String getActdomain() {
        return actdomain;
    }

    public void setActdomain(String actdomain) {
        this.actdomain = actdomain;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public PageImplBean<Transaction> getPagetransaction() {
        return pagetransaction;
    }

    public void setPagetransaction(PageImplBean<Transaction> pagetransaction) {
        this.pagetransaction = pagetransaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public List<Transaction> getListtransaction() {
        return listtransaction;
    }

    public void setListtransaction(List<Transaction> listtransaction) {
        this.listtransaction = listtransaction;
    }

    public PageImplBean<Transactiondet> getPagetransactiondet() {
        return pagetransactiondet;
    }

    public void setPagetransactiondet(PageImplBean<Transactiondet> pagetransactiondet) {
        this.pagetransactiondet = pagetransactiondet;
    }

    public Transactiondet getTransactiondet() {
        return transactiondet;
    }

    public void setTransactiondet(Transactiondet transactiondet) {
        this.transactiondet = transactiondet;
    }

    public List<Transactiondet> getListtransactiondet() {
        return listtransactiondet;
    }

    public void setListtransactiondet(List<Transactiondet> listtransactiondet) {
        this.listtransactiondet = listtransactiondet;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public PageImplBean<Transactionlog> getPagetransactionlog() {
        return pagetransactionlog;
    }

    public void setPagetransactionlog(PageImplBean<Transactionlog> pagetransactionlog) {
        this.pagetransactionlog = pagetransactionlog;
    }

    public Transactionlog getTransactionlog() {
        return transactionlog;
    }

    public void setTransactionlog(Transactionlog transactionlog) {
        this.transactionlog = transactionlog;
    }

    public List<Transactionlog> getListtransactionlog() {
        return listtransactionlog;
    }

    public void setListtransactionlog(List<Transactionlog> listtransactionlog) {
        this.listtransactionlog = listtransactionlog;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public PageImplBean<Transdetservice> getPagetransdetservice() {
        return pagetransdetservice;
    }

    public void setPagetransdetservice(PageImplBean<Transdetservice> pagetransdetservice) {
        this.pagetransdetservice = pagetransdetservice;
    }

    public Transdetservice getTransdetservice() {
        return transdetservice;
    }

    public void setTransdetservice(Transdetservice transdetservice) {
        this.transdetservice = transdetservice;
    }

    public List<Transdetservice> getListtransdetservice() {
        return listtransdetservice;
    }

    public void setListtransdetservice(List<Transdetservice> listtransdetservice) {
        this.listtransdetservice = listtransdetservice;
    }

    public PageImplBean<Activitylog> getPageactivitylog() {
        return pageactivitylog;
    }

    public void setPageactivitylog(PageImplBean<Activitylog> pageactivitylog) {
        this.pageactivitylog = pageactivitylog;
    }

    public Activitylog getActivitylog() {
        return activitylog;
    }

    public void setActivitylog(Activitylog activitylog) {
        this.activitylog = activitylog;
    }

    public List<Activitylog> getListactivitylog() {
        return listactivitylog;
    }

    public void setListactivitylog(List<Activitylog> listactivitylog) {
        this.listactivitylog = listactivitylog;
    }

    public Auth getAuth() {
        return auth;
    }

    public void setAuth(Auth auth) {
        this.auth = auth;
    }

    public PageImplBean<Seatlog> getPageseatlog() {
        return pageseatlog;
    }

    public void setPageseatlog(PageImplBean<Seatlog> pageseatlog) {
        this.pageseatlog = pageseatlog;
    }

    public Seatlog getSeatlog() {
        return seatlog;
    }

    public void setSeatlog(Seatlog seatlog) {
        this.seatlog = seatlog;
    }

    public List<Seatlog> getListseatlog() {
        return listseatlog;
    }

    public void setListseatlog(List<Seatlog> listseatlog) {
        this.listseatlog = listseatlog;
    }

    public PageImplBean<Occupationtype> getPageoccupationtype() {
        return pageoccupationtype;
    }

    public void setPageoccupationtype(PageImplBean<Occupationtype> pageoccupationtype) {
        this.pageoccupationtype = pageoccupationtype;
    }

    public Occupationtype getOccupationtype() {
        return occupationtype;
    }

    public void setOccupationtype(Occupationtype occupationtype) {
        this.occupationtype = occupationtype;
    }

    public List<Occupationtype> getListoccupationtype() {
        return listoccupationtype;
    }

    public void setListoccupationtype(List<Occupationtype> listoccupationtype) {
        this.listoccupationtype = listoccupationtype;
    }

    public PageImplBean<Grpreservation> getPagegrpreservation() {
        return pagegrpreservation;
    }

    public void setPagegrpreservation(PageImplBean<Grpreservation> pagegrpreservation) {
        this.pagegrpreservation = pagegrpreservation;
    }

    public Grpreservation getGrpreservation() {
        return grpreservation;
    }

    public void setGrpreservation(Grpreservation grpreservation) {
        this.grpreservation = grpreservation;
    }

    public List<Grpreservation> getListgrpreservation() {
        return listgrpreservation;
    }

    public void setListgrpreservation(List<Grpreservation> listgrpreservation) {
        this.listgrpreservation = listgrpreservation;
    }

    public PageImplBean<Grpreservationdet> getPagegrpreservationdet() {
        return pagegrpreservationdet;
    }

    public void setPagegrpreservationdet(PageImplBean<Grpreservationdet> pagegrpreservationdet) {
        this.pagegrpreservationdet = pagegrpreservationdet;
    }

    public Grpreservationdet getGrpreservationdet() {
        return grpreservationdet;
    }

    public void setGrpreservationdet(Grpreservationdet grpreservationdet) {
        this.grpreservationdet = grpreservationdet;
    }

    public List<Grpreservationdet> getListgrpreservationdet() {
        return listgrpreservationdet;
    }

    public void setListgrpreservationdet(List<Grpreservationdet> listgrpreservationdet) {
        this.listgrpreservationdet = listgrpreservationdet;
    }

    public PageImplBean<Grpreservationpsg> getPagegrpreservationpsg() {
        return pagegrpreservationpsg;
    }

    public void setPagegrpreservationpsg(PageImplBean<Grpreservationpsg> pagegrpreservationpsg) {
        this.pagegrpreservationpsg = pagegrpreservationpsg;
    }

    public Grpreservationpsg getGrpreservationpsg() {
        return grpreservationpsg;
    }

    public void setGrpreservationpsg(Grpreservationpsg grpreservationpsg) {
        this.grpreservationpsg = grpreservationpsg;
    }

    public List<Grpreservationpsg> getListgrpreservationpsg() {
        return listgrpreservationpsg;
    }

    public void setListgrpreservationpsg(List<Grpreservationpsg> listgrpreservationpsg) {
        this.listgrpreservationpsg = listgrpreservationpsg;
    }

    public PageImplBean<Grpreservationsrv> getPagegrpreservationsrv() {
        return pagegrpreservationsrv;
    }

    public void setPagegrpreservationsrv(PageImplBean<Grpreservationsrv> pagegrpreservationsrv) {
        this.pagegrpreservationsrv = pagegrpreservationsrv;
    }

    public Grpreservationsrv getGrpreservationsrv() {
        return grpreservationsrv;
    }

    public void setGrpreservationsrv(Grpreservationsrv grpreservationsrv) {
        this.grpreservationsrv = grpreservationsrv;
    }

    public List<Grpreservationsrv> getListgrpreservationsrv() {
        return listgrpreservationsrv;
    }

    public void setListgrpreservationsrv(List<Grpreservationsrv> listgrpreservationsrv) {
        this.listgrpreservationsrv = listgrpreservationsrv;
    }

    public PageImplBean<Grpreservationpay> getPagegrpreservationpay() {
        return pagegrpreservationpay;
    }

    public void setPagegrpreservationpay(PageImplBean<Grpreservationpay> pagegrpreservationpay) {
        this.pagegrpreservationpay = pagegrpreservationpay;
    }

    public Grpreservationpay getGrpreservationpay() {
        return grpreservationpay;
    }

    public void setGrpreservationpay(Grpreservationpay grpreservationpay) {
        this.grpreservationpay = grpreservationpay;
    }

    public List<Grpreservationpay> getListgrpreservationpay() {
        return listgrpreservationpay;
    }

    public void setListgrpreservationpay(List<Grpreservationpay> listgrpreservationpay) {
        this.listgrpreservationpay = listgrpreservationpay;
    }

    public PageImplBean<Vouchertype> getPagevouchertype() {
        return pagevouchertype;
    }

    public void setPagevouchertype(PageImplBean<Vouchertype> pagevouchertype) {
        this.pagevouchertype = pagevouchertype;
    }

    public Vouchertype getVouchertype() {
        return vouchertype;
    }

    public void setVouchertype(Vouchertype vouchertype) {
        this.vouchertype = vouchertype;
    }

    public List<Vouchertype> getListvouchertype() {
        return listvouchertype;
    }

    public void setListvouchertype(List<Vouchertype> listvouchertype) {
        this.listvouchertype = listvouchertype;
    }

    public PageImplBean<Voucheramount> getPagevoucheramount() {
        return pagevoucheramount;
    }

    public void setPagevoucheramount(PageImplBean<Voucheramount> pagevoucheramount) {
        this.pagevoucheramount = pagevoucheramount;
    }

    public Voucheramount getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(Voucheramount voucheramount) {
        this.voucheramount = voucheramount;
    }

    public List<Voucheramount> getListvoucheramount() {
        return listvoucheramount;
    }

    public void setListvoucheramount(List<Voucheramount> listvoucheramount) {
        this.listvoucheramount = listvoucheramount;
    }

    public PageImplBean<Voucher> getPagevoucher() {
        return pagevoucher;
    }

    public void setPagevoucher(PageImplBean<Voucher> pagevoucher) {
        this.pagevoucher = pagevoucher;
    }

    public Voucher getVoucher() {
        return voucher;
    }

    public void setVoucher(Voucher voucher) {
        this.voucher = voucher;
    }

    public List<Voucher> getListvoucher() {
        return listvoucher;
    }

    public void setListvoucher(List<Voucher> listvoucher) {
        this.listvoucher = listvoucher;
    }

    public PageImplBean<Dailyticket> getPagedailyticket() {
        return pagedailyticket;
    }

    public void setPagedailyticket(PageImplBean<Dailyticket> pagedailyticket) {
        this.pagedailyticket = pagedailyticket;
    }

    public Dailyticket getDailyticket() {
        return dailyticket;
    }

    public void setDailyticket(Dailyticket dailyticket) {
        this.dailyticket = dailyticket;
    }

    public List<Dailyticket> getListdailyticket() {
        return listdailyticket;
    }

    public void setListdailyticket(List<Dailyticket> listdailyticket) {
        this.listdailyticket = listdailyticket;
    }

    public PageImplBean<Cancellationtype> getPagecancellationtype() {
        return pagecancellationtype;
    }

    public void setPagecancellationtype(PageImplBean<Cancellationtype> pagecancellationtype) {
        this.pagecancellationtype = pagecancellationtype;
    }

    public Cancellationtype getCancellationtype() {
        return cancellationtype;
    }

    public void setCancellationtype(Cancellationtype cancellationtype) {
        this.cancellationtype = cancellationtype;
    }

    public List<Cancellationtype> getListcancellationtype() {
        return listcancellationtype;
    }

    public void setListcancellationtype(List<Cancellationtype> listcancellationtype) {
        this.listcancellationtype = listcancellationtype;
    }

    public PageImplBean<Cancellation> getPagecancellation() {
        return pagecancellation;
    }

    public void setPagecancellation(PageImplBean<Cancellation> pagecancellation) {
        this.pagecancellation = pagecancellation;
    }

    public Cancellation getCancellation() {
        return cancellation;
    }

    public void setCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
    }

    public List<Cancellation> getListcancellation() {
        return listcancellation;
    }

    public void setListcancellation(List<Cancellation> listcancellation) {
        this.listcancellation = listcancellation;
    }

    public PageImplBean<Cancellationdet> getPagecancellationdet() {
        return pagecancellationdet;
    }

    public void setPagecancellationdet(PageImplBean<Cancellationdet> pagecancellationdet) {
        this.pagecancellationdet = pagecancellationdet;
    }

    public Cancellationdet getCancellationdet() {
        return cancellationdet;
    }

    public void setCancellationdet(Cancellationdet cancellationdet) {
        this.cancellationdet = cancellationdet;
    }

    public List<Cancellationdet> getListcancellationdet() {
        return listcancellationdet;
    }

    public void setListcancellationdet(List<Cancellationdet> listcancellationdet) {
        this.listcancellationdet = listcancellationdet;
    }

    public PageImplBean<Cancelreason> getPagecancelreason() {
        return pagecancelreason;
    }

    public void setPagecancelreason(PageImplBean<Cancelreason> pagecancelreason) {
        this.pagecancelreason = pagecancelreason;
    }

    public Cancelreason getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(Cancelreason cancelreason) {
        this.cancelreason = cancelreason;
    }

    public List<Cancelreason> getListcancelreason() {
        return listcancelreason;
    }

    public void setListcancelreason(List<Cancelreason> listcancelreason) {
        this.listcancelreason = listcancelreason;
    }
    
    public PageImplBean<Refund> getPagerefund() {
        return pagerefund;
    }

    public void setPagerefund(PageImplBean<Refund> pagerefund) {
        this.pagerefund = pagerefund;
    }

    public Refund getRefund() {
        return refund;
    }

    public void setRefund(Refund refund) {
        this.refund = refund;
    }

    public List<Refund> getListrefund() {
        return listrefund;
    }

    public void setListrefund(List<Refund> listrefund) {
        this.listrefund = listrefund;
    }

    public PageImplBean<Pasepartu> getPagepasepartu() {
        return pagepasepartu;
    }

    public void setPagepasepartu(PageImplBean<Pasepartu> pagepasepartu) {
        this.pagepasepartu = pagepasepartu;
    }

    public Pasepartu getPasepartu() {
        return pasepartu;
    }

    public void setPasepartu(Pasepartu pasepartu) {
        this.pasepartu = pasepartu;
    }

    public List<Pasepartu> getListpasepartu() {
        return listpasepartu;
    }

    public void setListpasepartu(List<Pasepartu> listpasepartu) {
        this.listpasepartu = listpasepartu;
    }

    public PageImplBean<Suplisi> getPagesuplisi() {
        return pagesuplisi;
    }

    public void setPagesuplisi(PageImplBean<Suplisi> pagesuplisi) {
        this.pagesuplisi = pagesuplisi;
    }

    public Suplisi getSuplisi() {
        return suplisi;
    }

    public void setSuplisi(Suplisi suplisi) {
        this.suplisi = suplisi;
    }

    public List<Suplisi> getListsuplisi() {
        return listsuplisi;
    }

    public void setListsuplisi(List<Suplisi> listsuplisi) {
        this.listsuplisi = listsuplisi;
    }

    public PageImplBean<Baggage> getPagebaggage() {
        return pagebaggage;
    }

    public void setPagebaggage(PageImplBean<Baggage> pagebaggage) {
        this.pagebaggage = pagebaggage;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public List<Baggage> getListbaggage() {
        return listbaggage;
    }

    public void setListbaggage(List<Baggage> listbaggage) {
        this.listbaggage = listbaggage;
    }

    public PageImplBean<Baggagetrans> getPagebaggagetrans() {
        return pagebaggagetrans;
    }

    public void setPagebaggagetrans(PageImplBean<Baggagetrans> pagebaggagetrans) {
        this.pagebaggagetrans = pagebaggagetrans;
    }

    public Baggagetrans getBaggagetrans() {
        return baggagetrans;
    }

    public void setBaggagetrans(Baggagetrans baggagetrans) {
        this.baggagetrans = baggagetrans;
    }

    public List<Baggagetrans> getListbaggagetrans() {
        return listbaggagetrans;
    }

    public void setListbaggagetrans(List<Baggagetrans> listbaggagetrans) {
        this.listbaggagetrans = listbaggagetrans;
    }

    public PageImplBean<Availability> getPageavailability() {
        return pageavailability;
    }

    public void setPageavailability(PageImplBean<Availability> pageavailability) {
        this.pageavailability = pageavailability;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public List<Availability> getListavailability() {
        return listavailability;
    }

    public void setListavailability(List<Availability> listavailability) {
        this.listavailability = listavailability;
    }

    public PageImplBean<Seatmap> getPageseatmap() {
        return pageseatmap;
    }

    public void setPageseatmap(PageImplBean<Seatmap> pageseatmap) {
        this.pageseatmap = pageseatmap;
    }

    public Seatmap getSeatmap() {
        return seatmap;
    }

    public void setSeatmap(Seatmap seatmap) {
        this.seatmap = seatmap;
    }

    public List<Seatmap> getListseatmap() {
        return listseatmap;
    }

    public void setListseatmap(List<Seatmap> listseatmap) {
        this.listseatmap = listseatmap;
    }

    public PageImplBean<Discountsch> getPagediscountsch() {
        return pagediscountsch;
    }

    public void setPagediscountsch(PageImplBean<Discountsch> pagediscountsch) {
        this.pagediscountsch = pagediscountsch;
    }

    public Discountsch getDiscountsch() {
        return discountsch;
    }

    public void setDiscountsch(Discountsch discountsch) {
        this.discountsch = discountsch;
    }

    public List<Discountsch> getListdiscountsch() {
        return listdiscountsch;
    }

    public void setListdiscountsch(List<Discountsch> listdiscountsch) {
        this.listdiscountsch = listdiscountsch;
    }

    public PageImplBean<Bookinfo> getPagebookinfo() {
        return pagebookinfo;
    }

    public void setPagebookinfo(PageImplBean<Bookinfo> pagebookinfo) {
        this.pagebookinfo = pagebookinfo;
    }

    public Bookinfo getBookinfo() {
        return bookinfo;
    }

    public void setBookinfo(Bookinfo bookinfo) {
        this.bookinfo = bookinfo;
    }

    public List<Bookinfo> getListbookinfo() {
        return listbookinfo;
    }

    public void setListbookinfo(List<Bookinfo> listbookinfo) {
        this.listbookinfo = listbookinfo;
    }

    public PageImplBean<Daop> getPagedaop() {
        return pagedaop;
    }

    public void setPagedaop(PageImplBean<Daop> pagedaop) {
        this.pagedaop = pagedaop;
    }

    public Daop getDaop() {
        return daop;
    }

    public void setDaop(Daop daop) {
        this.daop = daop;
    }

    public List<Daop> getListdaop() {
        return listdaop;
    }

    public void setListdaop(List<Daop> listdaop) {
        this.listdaop = listdaop;
    }

    public PageImplBean<Tabstn> getPagetabstn() {
        return pagetabstn;
    }

    public void setPagetabstn(PageImplBean<Tabstn> pagetabstn) {
        this.pagetabstn = pagetabstn;
    }

    public Tabstn getTabstn() {
        return tabstn;
    }

    public void setTabstn(Tabstn tabstn) {
        this.tabstn = tabstn;
    }

    public List<Tabstn> getListtabstn() {
        return listtabstn;
    }

    public void setListtabstn(List<Tabstn> listtabstn) {
        this.listtabstn = listtabstn;
    }

    public PageImplBean<Ka> getPageka() {
        return pageka;
    }

    public void setPageka(PageImplBean<Ka> pageka) {
        this.pageka = pageka;
    }

    public Ka getKa() {
        return ka;
    }

    public void setKa(Ka ka) {
        this.ka = ka;
    }

    public List<Ka> getListka() {
        return listka;
    }

    public void setListka(List<Ka> listka) {
        this.listka = listka;
    }

    public PageImplBean<Gapeka> getPagegapeka() {
        return pagegapeka;
    }

    public void setPagegapeka(PageImplBean<Gapeka> pagegapeka) {
        this.pagegapeka = pagegapeka;
    }

    public Gapeka getGapeka() {
        return gapeka;
    }

    public void setGapeka(Gapeka gapeka) {
        this.gapeka = gapeka;
    }

    public List<Gapeka> getListgapeka() {
        return listgapeka;
    }

    public void setListgapeka(List<Gapeka> listgapeka) {
        this.listgapeka = listgapeka;
    }

    public PageImplBean<Rtsngtglkajalanpnpall> getPagertsngtglkajalanpnpall() {
        return pagertsngtglkajalanpnpall;
    }

    public void setPagertsngtglkajalanpnpall(PageImplBean<Rtsngtglkajalanpnpall> pagertsngtglkajalanpnpall) {
        this.pagertsngtglkajalanpnpall = pagertsngtglkajalanpnpall;
    }

    public Rtsngtglkajalanpnpall getRtsngtglkajalanpnpall() {
        return rtsngtglkajalanpnpall;
    }

    public void setRtsngtglkajalanpnpall(Rtsngtglkajalanpnpall rtsngtglkajalanpnpall) {
        this.rtsngtglkajalanpnpall = rtsngtglkajalanpnpall;
    }

    public List<Rtsngtglkajalanpnpall> getListrtsngtglkajalanpnpall() {
        return listrtsngtglkajalanpnpall;
    }

    public void setListrtsngtglkajalanpnpall(List<Rtsngtglkajalanpnpall> listrtsngtglkajalanpnpall) {
        this.listrtsngtglkajalanpnpall = listrtsngtglkajalanpnpall;
    }

    public PageImplBean<Rtsngtglkajalanpnpstop> getPagertsngtglkajalanpnpstop() {
        return pagertsngtglkajalanpnpstop;
    }

    public void setPagertsngtglkajalanpnpstop(PageImplBean<Rtsngtglkajalanpnpstop> pagertsngtglkajalanpnpstop) {
        this.pagertsngtglkajalanpnpstop = pagertsngtglkajalanpnpstop;
    }

    public Rtsngtglkajalanpnpstop getRtsngtglkajalanpnpstop() {
        return rtsngtglkajalanpnpstop;
    }

    public void setRtsngtglkajalanpnpstop(Rtsngtglkajalanpnpstop rtsngtglkajalanpnpstop) {
        this.rtsngtglkajalanpnpstop = rtsngtglkajalanpnpstop;
    }

    public List<Rtsngtglkajalanpnpstop> getListrtsngtglkajalanpnpstop() {
        return listrtsngtglkajalanpnpstop;
    }

    public void setListrtsngtglkajalanpnpstop(List<Rtsngtglkajalanpnpstop> listrtsngtglkajalanpnpstop) {
        this.listrtsngtglkajalanpnpstop = listrtsngtglkajalanpnpstop;
    }

    public PageImplBean<AgentTrans> getPageagenttrans() {
        return pageagenttrans;
    }

    public void setPageagenttrans(PageImplBean<AgentTrans> pageagenttrans) {
        this.pageagenttrans = pageagenttrans;
    }

    public AgentTrans getAgenttrans() {
        return agenttrans;
    }

    public void setAgenttrans(AgentTrans agenttrans) {
        this.agenttrans = agenttrans;
    }

    public List<AgentTrans> getListagenttrans() {
        return listagenttrans;
    }

    public void setListagenttrans(List<AgentTrans> listagenttrans) {
        this.listagenttrans = listagenttrans;
    }

    public PageImplBean<AgentBalance> getPageagentbalance() {
        return pageagentbalance;
    }

    public void setPageagentbalance(PageImplBean<AgentBalance> pageagentbalance) {
        this.pageagentbalance = pageagentbalance;
    }

    public AgentBalance getAgentbalance() {
        return agentbalance;
    }

    public void setAgentbalance(AgentBalance agentbalance) {
        this.agentbalance = agentbalance;
    }

    public List<AgentBalance> getListagentbalance() {
        return listagentbalance;
    }

    public void setListagentbalance(List<AgentBalance> listagentbalance) {
        this.listagentbalance = listagentbalance;
    }

    public PageImplBean<Title> getPagetitle() {
        return pagetitle;
    }

    public void setPagetitle(PageImplBean<Title> pagetitle) {
        this.pagetitle = pagetitle;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<Title> getListtitle() {
        return listtitle;
    }

    public void setListtitle(List<Title> listtitle) {
        this.listtitle = listtitle;
    }

    public PageImplBean<Mappingunit> getPagemapingunit() {
        return pagemapingunit;
    }

    public void setPagemapingunit(PageImplBean<Mappingunit> pagemapingunit) {
        this.pagemapingunit = pagemapingunit;
    }

    public Mappingunit getMapingunit() {
        return mapingunit;
    }

    public void setMapingunit(Mappingunit mapingunit) {
        this.mapingunit = mapingunit;
    }

    public List<Mappingunit> getListmapingunit() {
        return listmapingunit;
    }

    public void setListmapingunit(List<Mappingunit> listmapingunit) {
        this.listmapingunit = listmapingunit;
    }

    public PageImplBean<Checkin> getPagecheckin() {
        return pagecheckin;
    }

    public void setPagecheckin(PageImplBean<Checkin> pagecheckin) {
        this.pagecheckin = pagecheckin;
    }

    public Checkin getCheckin() {
        return checkin;
    }

    public void setCheckin(Checkin checkin) {
        this.checkin = checkin;
    }

    public List<Checkin> getListcheckin() {
        return listcheckin;
    }

    public void setListcheckin(List<Checkin> listcheckin) {
        this.listcheckin = listcheckin;
    }


    public PageImplBean<Ticketsaleoffset> getPageticketsaleoffset() {
        return pageticketsaleoffset;
    }

    public void setPageticketsaleoffset(PageImplBean<Ticketsaleoffset> pageticketsaleoffset) {
        this.pageticketsaleoffset = pageticketsaleoffset;
    }

    public Ticketsaleoffset getTicketsaleoffset() {
        return ticketsaleoffset;
    }

    public void setTicketsaleoffset(Ticketsaleoffset ticketsaleoffset) {
        this.ticketsaleoffset = ticketsaleoffset;
    }

    public List<Ticketsaleoffset> getListticketsaleoffset() {
        return listticketsaleoffset;
    }

    public void setListticketsaleoffset(List<Ticketsaleoffset> listticketsaleoffset) {
        this.listticketsaleoffset = listticketsaleoffset;
    }
    
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PageImplBean<Refundupload> getPagerefundupload() {
        return pagerefundupload;
    }

    public void setPagerefundupload(PageImplBean<Refundupload> pagerefundupload) {
        this.pagerefundupload = pagerefundupload;
    }

    public Refundupload getRefundupload() {
        return refundupload;
    }

    public void setRefundupload(Refundupload refundupload) {
        this.refundupload = refundupload;
    }

    public List<Refundupload> getListrefundupload() {
        return listrefundupload;
    }

    public void setListrefundupload(List<Refundupload> listrefundupload) {
        this.listrefundupload = listrefundupload;
    }

    public PageImplBean<Tripschedule> getPagetripschedule() {
        return pagetripschedule;
    }

    public void setPagetripschedule(PageImplBean<Tripschedule> pagetripschedule) {
        this.pagetripschedule = pagetripschedule;
    }

    public Tripschedule getTripschedule() {
        return tripschedule;
    }

    public void setTripschedule(Tripschedule tripschedule) {
        this.tripschedule = tripschedule;
    }

    public List<Tripschedule> getListtripschedule() {
        return listtripschedule;
    }

    public void setListtripschedule(List<Tripschedule> listtripschedule) {
        this.listtripschedule = listtripschedule;
    }

    public String getInfantRateId() {
        return infantRateId;
    }

    public void setInfantRateId(String infantRateId) {
        this.infantRateId = infantRateId;
    }

    public Integer getInfantTotAmount() {
        return infantTotAmount;
    }

    public void setInfantTotAmount(Integer infantTotAmount) {
        this.infantTotAmount = infantTotAmount;
    }

    public PageImplBean<Compensation> getPagecompensation() {
        return pagecompensation;
    }

    public void setPagecompensation(PageImplBean<Compensation> pagecompensation) {
        this.pagecompensation = pagecompensation;
    }

    public Compensation getCompensation() {
        return compensation;
    }

    public void setCompensation(Compensation compensation) {
        this.compensation = compensation;
    }

    public List<Compensation> getListcompensation() {
        return listcompensation;
    }

    public void setListcompensation(List<Compensation> listcompensation) {
        this.listcompensation = listcompensation;
    }

    public PageImplBean<Okupansi> getPageokupansi() {
        return pageokupansi;
    }

    public void setPageokupansi(PageImplBean<Okupansi> pageokupansi) {
        this.pageokupansi = pageokupansi;
    }

    public Okupansi getOkupansi() {
        return okupansi;
    }

    public void setOkupansi(Okupansi okupansi) {
        this.okupansi = okupansi;
    }

    public List<Okupansi> getListokupansi() {
        return listokupansi;
    }

    public void setListokupansi(List<Okupansi> listokupansi) {
        this.listokupansi = listokupansi;
    }

    public PageImplBean<Penjunit> getPagepenjunit() {
        return pagepenjunit;
    }

    public void setPagepenjunit(PageImplBean<Penjunit> pagepenjunit) {
        this.pagepenjunit = pagepenjunit;
    }

    public Penjunit getPenjunit() {
        return penjunit;
    }

    public void setPenjunit(Penjunit penjunit) {
        this.penjunit = penjunit;
    }

    public List<Penjunit> getListpenjunit() {
        return listpenjunit;
    }

    public void setListpenjunit(List<Penjunit> listpenjunit) {
        this.listpenjunit = listpenjunit;
    }
}
