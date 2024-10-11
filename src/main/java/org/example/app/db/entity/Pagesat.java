package org.example.app.db.entity;

import java.util.List;

public class Pagesat {
        private Long id;
        private Long student_id;
        private String data_e_fillimit;
        private String data_e_mbarimit;
        private Boolean eshte_paguar;
        private String paguar_me;
        private List<String> pagesat;

    public Pagesat(Long id, Long student_id, String data_e_fillimit, String data_e_mbarimit, Boolean eshte_paguar, String paguar_me, List<String> pagesat) {
        this.id = id;
        this.student_id = student_id;
        this.data_e_fillimit = data_e_fillimit;
        this.data_e_mbarimit = data_e_mbarimit;
        this.eshte_paguar = eshte_paguar;
        this.paguar_me = paguar_me;
        this.pagesat = pagesat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public String getData_e_fillimit() {
        return data_e_fillimit;
    }

    public void setData_e_fillimit(String data_e_fillimit) {
        this.data_e_fillimit = data_e_fillimit;
    }

    public String getData_e_mbarimit() {
        return data_e_mbarimit;
    }

    public void setData_e_mbarimit(String data_e_mbarimit) {
        this.data_e_mbarimit = data_e_mbarimit;
    }

    public Boolean getEshte_paguar() {
        return eshte_paguar;
    }

    public void setEshte_paguar(Boolean eshte_paguar) {
        this.eshte_paguar = eshte_paguar;
    }

    public String getPaguar_me() {
        return paguar_me;
    }

    public void setPaguar_me(String paguar_me) {
        this.paguar_me = paguar_me;
    }

    public List<String> getPagesat() {
        return pagesat;
    }

    public void setPagesat(List<String> pagesat) {
        this.pagesat = pagesat;
    }

    @Override
    public String toString() {
        return "Pagesat{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", data_e_fillimit='" + data_e_fillimit + '\'' +
                ", data_e_mbarimit='" + data_e_mbarimit + '\'' +
                ", eshte_paguar=" + eshte_paguar +
                ", paguar_me='" + paguar_me + '\'' +
                ", pagesat=" + pagesat +
                '}';
    }
}
