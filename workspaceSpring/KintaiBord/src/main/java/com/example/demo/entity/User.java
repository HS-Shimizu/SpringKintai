package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name = "kintai")
public class User {
//    /**
//     * ID
//     */
   @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    /**
//     * 名前
//     */
//    @Column(name = "name")
//    private String name;
//    /**
//     * 住所
//     */
//    @Column(name = "address")
//    private String address;
//    /**
//     * 電話番号
//     */
//    @Column(name = "phone")
//    private String phone;
//    /**
//     * 更新日時
//     */
//    @Column(name = "update_date")
//    private Date updateDate;
//    /**
//     * 登録日時
//     */
//    @Column(name = "create_date")
//    private Date createDate;
//    /**
//     * 削除日時
//     */
//    @Column(name = "delete_date")
//    private Date deleteDate;

    /**
     * 削除日時
     */
    @Column(name = "ymd")
   private String ymd;

    /**
     * 住所
     */
    @Column(name = "work_st")
    private String work_st;

    /**
     * 住所
     */
    @Column(name = "work_ed")
    private String work_ed;

    /**
     * 住所
     */
    @Column(name = "work_rt")
    private String work_rt;
}