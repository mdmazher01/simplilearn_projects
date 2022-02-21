//package com.project.SportyShoes.entity;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//
//import javax.persistence.Column;
//import javax.persistence.EntityListeners;
//import javax.persistence.MappedSuperclass;
//
//
//
//import java.util.Date;
//
//@MappedSuperclass
//@Data
//@EqualsAndHashCode
//@EntityListeners(EntityListener.class)
//public abstract class BaseEntity {
//    @Column(nullable = false, updatable = false)
//    private String createDate;
//
//    @Column(insertable = false)
//    private String lastUpdateDate;
//
//	public String getCreateDate() {
//		return createDate;
//	}
//
//	public void setCreateDate(String createDate) {
//		this.createDate = createDate;
//	}
//
//	public String getLastUpdateDate() {
//		return lastUpdateDate;
//	}
//
//	public void setLastUpdateDate(String lastUpdateDate) {
//		this.lastUpdateDate = lastUpdateDate;
//	}
//
//}
