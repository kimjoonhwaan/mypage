package skcc;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="View_table")
public class View {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String 상품이름;
        private String hospitalNm;
        private String custNm;
        private String hospitalNm;
        private String chkDate;
        private String status;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String get상품이름() {
            return 상품이름;
        }

        public void set상품이름(String 상품이름) {
            this.상품이름 = 상품이름;
        }
        public String getHospitalNm() {
            return hospitalNm;
        }

        public void setHospitalNm(String hospitalNm) {
            this.hospitalNm = hospitalNm;
        }
        public String getCustNm() {
            return custNm;
        }

        public void setCustNm(String custNm) {
            this.custNm = custNm;
        }
        public String getHospitalNm() {
            return hospitalNm;
        }

        public void setHospitalNm(String hospitalNm) {
            this.hospitalNm = hospitalNm;
        }
        public String getChkDate() {
            return chkDate;
        }

        public void setChkDate(String chkDate) {
            this.chkDate = chkDate;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

}
