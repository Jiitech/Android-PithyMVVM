package com.wukj.business.net.entity.response;

import com.wukj.entity.SuperResponseEntity;

/**
 * 项目名称：${project_name}
 * 包名称：${package_name}.${file_name}
 * 创建时间：2018/8/2 15:36
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/2 15:36
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class LoginEntity extends SuperResponseEntity {

    /**
     * driver : {"adress":"南山养老院","age":22,"birthday":838828800000,"census":"南山养老院","certificateNo":"120","commercialType":2,"companyId":"2","contactAddress":"山东省美国市","contractCompany":"山东易出行","contractOff":1753977600000,"contractOn":1533052800000,"delFlag":"1","driverLicenceNo":"110","education":"","email":"","emergencyContact":"","emergencyContactAddress":"","fullTimeDriver":1,"getnetworkcarProffDate":1533052800000,"getnetworkcarProffOff":1688140800000,"getnetworkcarProffOn":1533052800000,"groupId":"24","id":"1","idcardNo":"37110101","idcardType":"1","inDriverBlacklist":0,"isEmailAuth":"1","isMarriage":1,"isMobileAuth":"1","isTexidRiver":1,"languagelLevel":"一窍不通","licencePhoteoId":"","licenseAcquisitionDate":1533052800000,"licenseValidityEnddate":1722441600000,"licenseValidityStartdate":"2018-08-01","loginIp":"","mobile":"17600759385","name":"王尼玛","nation":"汉族","nationality":"中国","networkcarIssueDate":1533052800000,"networkcarIssueOrganization":"北海幼儿园","nickName":"尼玛啊","origin":"","password":"e10adc3949ba59abbe56e057f20f883e","portraitPath":"","proffRegisterDate":1533052800000,"quasiCarType":"C1","registerDate":1533052800000,"sex":"1","status":"1"}
     * key : wz126o
     * token : eyJhbGciOiJIUzUxMiJ9.eyJyYW5kb21LZXkiOiJ3ejEyNm8iLCJzdWIiOiIxNzYwMDc1OTM4NSIsImV4cCI6MTUzNDMwMzk3OCwiaWF0IjoxNTMzNjk5MTc4fQ.xsQC7X0T-z5Cx6dCUr2r7Olvn19yy8c5Hp-z448n-kAY-Y67zXy-8BO_qO4huPo5gV-BmLk16zkiii26x-XtJA
     */

    private DriverBean driver;
    private String key;
    private String token;

    public DriverBean getDriver() {
        return driver;
    }

    public void setDriver(DriverBean driver) {
        this.driver = driver;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class DriverBean {
        /**
         * adress : 南山养老院
         * age : 22
         * birthday : 838828800000
         * census : 南山养老院
         * certificateNo : 120
         * commercialType : 2
         * companyId : 2
         * contactAddress : 山东省美国市
         * contractCompany : 山东易出行
         * contractOff : 1753977600000
         * contractOn : 1533052800000
         * delFlag : 1
         * driverLicenceNo : 110
         * education :
         * email :
         * emergencyContact :
         * emergencyContactAddress :
         * fullTimeDriver : 1
         * getnetworkcarProffDate : 1533052800000
         * getnetworkcarProffOff : 1688140800000
         * getnetworkcarProffOn : 1533052800000
         * groupId : 24
         * id : 1
         * idcardNo : 37110101
         * idcardType : 1
         * inDriverBlacklist : 0
         * isEmailAuth : 1
         * isMarriage : 1
         * isMobileAuth : 1
         * isTexidRiver : 1
         * languagelLevel : 一窍不通
         * licencePhoteoId :
         * licenseAcquisitionDate : 1533052800000
         * licenseValidityEnddate : 1722441600000
         * licenseValidityStartdate : 2018-08-01
         * loginIp :
         * mobile : 17600759385
         * name : 王尼玛
         * nation : 汉族
         * nationality : 中国
         * networkcarIssueDate : 1533052800000
         * networkcarIssueOrganization : 北海幼儿园
         * nickName : 尼玛啊
         * origin :
         * password : e10adc3949ba59abbe56e057f20f883e
         * portraitPath :
         * proffRegisterDate : 1533052800000
         * quasiCarType : C1
         * registerDate : 1533052800000
         * sex : 1
         * status : 1
         */

        private String adress;
        private int age;
        private long birthday;
        private String census;
        private String certificateNo;
        private int commercialType;
        private String companyId;
        private String contactAddress;
        private String contractCompany;
        private long contractOff;
        private long contractOn;
        private String delFlag;
        private String driverLicenceNo;
        private String education;
        private String email;
        private String emergencyContact;
        private String emergencyContactAddress;
        private int fullTimeDriver;
        private long getnetworkcarProffDate;
        private long getnetworkcarProffOff;
        private long getnetworkcarProffOn;
        private String groupId;
        private String id;
        private String idcardNo;
        private String idcardType;
        private int inDriverBlacklist;
        private String isEmailAuth;
        private int isMarriage;
        private String isMobileAuth;
        private int isTexidRiver;
        private String languagelLevel;
        private String licencePhoteoId;
        private long licenseAcquisitionDate;
        private long licenseValidityEnddate;
        private String licenseValidityStartdate;
        private String loginIp;
        private String mobile;
        private String name;
        private String nation;
        private String nationality;
        private long networkcarIssueDate;
        private String networkcarIssueOrganization;
        private String nickName;
        private String origin;
        private String password;
        private String portraitPath;
        private long proffRegisterDate;
        private String quasiCarType;
        private long registerDate;
        private String sex;
        private String status;

        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public long getBirthday() {
            return birthday;
        }

        public void setBirthday(long birthday) {
            this.birthday = birthday;
        }

        public String getCensus() {
            return census;
        }

        public void setCensus(String census) {
            this.census = census;
        }

        public String getCertificateNo() {
            return certificateNo;
        }

        public void setCertificateNo(String certificateNo) {
            this.certificateNo = certificateNo;
        }

        public int getCommercialType() {
            return commercialType;
        }

        public void setCommercialType(int commercialType) {
            this.commercialType = commercialType;
        }

        public String getCompanyId() {
            return companyId;
        }

        public void setCompanyId(String companyId) {
            this.companyId = companyId;
        }

        public String getContactAddress() {
            return contactAddress;
        }

        public void setContactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
        }

        public String getContractCompany() {
            return contractCompany;
        }

        public void setContractCompany(String contractCompany) {
            this.contractCompany = contractCompany;
        }

        public long getContractOff() {
            return contractOff;
        }

        public void setContractOff(long contractOff) {
            this.contractOff = contractOff;
        }

        public long getContractOn() {
            return contractOn;
        }

        public void setContractOn(long contractOn) {
            this.contractOn = contractOn;
        }

        public String getDelFlag() {
            return delFlag;
        }

        public void setDelFlag(String delFlag) {
            this.delFlag = delFlag;
        }

        public String getDriverLicenceNo() {
            return driverLicenceNo;
        }

        public void setDriverLicenceNo(String driverLicenceNo) {
            this.driverLicenceNo = driverLicenceNo;
        }

        public String getEducation() {
            return education;
        }

        public void setEducation(String education) {
            this.education = education;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmergencyContact() {
            return emergencyContact;
        }

        public void setEmergencyContact(String emergencyContact) {
            this.emergencyContact = emergencyContact;
        }

        public String getEmergencyContactAddress() {
            return emergencyContactAddress;
        }

        public void setEmergencyContactAddress(String emergencyContactAddress) {
            this.emergencyContactAddress = emergencyContactAddress;
        }

        public int getFullTimeDriver() {
            return fullTimeDriver;
        }

        public void setFullTimeDriver(int fullTimeDriver) {
            this.fullTimeDriver = fullTimeDriver;
        }

        public long getGetnetworkcarProffDate() {
            return getnetworkcarProffDate;
        }

        public void setGetnetworkcarProffDate(long getnetworkcarProffDate) {
            this.getnetworkcarProffDate = getnetworkcarProffDate;
        }

        public long getGetnetworkcarProffOff() {
            return getnetworkcarProffOff;
        }

        public void setGetnetworkcarProffOff(long getnetworkcarProffOff) {
            this.getnetworkcarProffOff = getnetworkcarProffOff;
        }

        public long getGetnetworkcarProffOn() {
            return getnetworkcarProffOn;
        }

        public void setGetnetworkcarProffOn(long getnetworkcarProffOn) {
            this.getnetworkcarProffOn = getnetworkcarProffOn;
        }

        public String getGroupId() {
            return groupId;
        }

        public void setGroupId(String groupId) {
            this.groupId = groupId;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIdcardNo() {
            return idcardNo;
        }

        public void setIdcardNo(String idcardNo) {
            this.idcardNo = idcardNo;
        }

        public String getIdcardType() {
            return idcardType;
        }

        public void setIdcardType(String idcardType) {
            this.idcardType = idcardType;
        }

        public int getInDriverBlacklist() {
            return inDriverBlacklist;
        }

        public void setInDriverBlacklist(int inDriverBlacklist) {
            this.inDriverBlacklist = inDriverBlacklist;
        }

        public String getIsEmailAuth() {
            return isEmailAuth;
        }

        public void setIsEmailAuth(String isEmailAuth) {
            this.isEmailAuth = isEmailAuth;
        }

        public int getIsMarriage() {
            return isMarriage;
        }

        public void setIsMarriage(int isMarriage) {
            this.isMarriage = isMarriage;
        }

        public String getIsMobileAuth() {
            return isMobileAuth;
        }

        public void setIsMobileAuth(String isMobileAuth) {
            this.isMobileAuth = isMobileAuth;
        }

        public int getIsTexidRiver() {
            return isTexidRiver;
        }

        public void setIsTexidRiver(int isTexidRiver) {
            this.isTexidRiver = isTexidRiver;
        }

        public String getLanguagelLevel() {
            return languagelLevel;
        }

        public void setLanguagelLevel(String languagelLevel) {
            this.languagelLevel = languagelLevel;
        }

        public String getLicencePhoteoId() {
            return licencePhoteoId;
        }

        public void setLicencePhoteoId(String licencePhoteoId) {
            this.licencePhoteoId = licencePhoteoId;
        }

        public long getLicenseAcquisitionDate() {
            return licenseAcquisitionDate;
        }

        public void setLicenseAcquisitionDate(long licenseAcquisitionDate) {
            this.licenseAcquisitionDate = licenseAcquisitionDate;
        }

        public long getLicenseValidityEnddate() {
            return licenseValidityEnddate;
        }

        public void setLicenseValidityEnddate(long licenseValidityEnddate) {
            this.licenseValidityEnddate = licenseValidityEnddate;
        }

        public String getLicenseValidityStartdate() {
            return licenseValidityStartdate;
        }

        public void setLicenseValidityStartdate(String licenseValidityStartdate) {
            this.licenseValidityStartdate = licenseValidityStartdate;
        }

        public String getLoginIp() {
            return loginIp;
        }

        public void setLoginIp(String loginIp) {
            this.loginIp = loginIp;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNation() {
            return nation;
        }

        public void setNation(String nation) {
            this.nation = nation;
        }

        public String getNationality() {
            return nationality;
        }

        public void setNationality(String nationality) {
            this.nationality = nationality;
        }

        public long getNetworkcarIssueDate() {
            return networkcarIssueDate;
        }

        public void setNetworkcarIssueDate(long networkcarIssueDate) {
            this.networkcarIssueDate = networkcarIssueDate;
        }

        public String getNetworkcarIssueOrganization() {
            return networkcarIssueOrganization;
        }

        public void setNetworkcarIssueOrganization(String networkcarIssueOrganization) {
            this.networkcarIssueOrganization = networkcarIssueOrganization;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPortraitPath() {
            return portraitPath;
        }

        public void setPortraitPath(String portraitPath) {
            this.portraitPath = portraitPath;
        }

        public long getProffRegisterDate() {
            return proffRegisterDate;
        }

        public void setProffRegisterDate(long proffRegisterDate) {
            this.proffRegisterDate = proffRegisterDate;
        }

        public String getQuasiCarType() {
            return quasiCarType;
        }

        public void setQuasiCarType(String quasiCarType) {
            this.quasiCarType = quasiCarType;
        }

        public long getRegisterDate() {
            return registerDate;
        }

        public void setRegisterDate(long registerDate) {
            this.registerDate = registerDate;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
