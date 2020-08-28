package skcc;

public class ReservationRegistered extends AbstractEvent {

    private Long id;
    private String resvId;
    private String screeningId;
    private String hospitalId;
    private String chkDate;
    private String custNm;
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getResvId() {
        return resvId;
    }

    public void setResvId(String resvId) {
        this.resvId = resvId;
    }
    public String getCheckupId() {
        return screeningId;
    }

    public void setCheckupId(String screeningId) {
        this.screeningId = screeningId;
    }
    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
    public String getChkDate() {
        return chkDate;
    }

    public void setChkDate(String chkDate) {
        this.chkDate = chkDate;
    }
    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}