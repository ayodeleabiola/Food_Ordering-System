package com.mystartup.foodapplication.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
 private static final Long serialVersionUid=1L;
 private String resourceName;
 private String fieldName;
 private Object fieldValue;

 public ResourceNotFoundException( String resourceName,String fieldName,Object fieldValue){
  super(String.format("%s,%s:%s",resourceName,fieldName,fieldValue));
  this.resourceName=resourceName;
  this.fieldName=fieldName;
  this.fieldValue=fieldValue;
 }

 public String getResourceName() {
  return resourceName;
 }

 public void setResourceName(String resourceName) {
  this.resourceName = resourceName;
 }

 public String getFieldName() {
  return fieldName;
 }

 public void setFieldName(String fieldName) {
  this.fieldName = fieldName;
 }

 public Object getFieldValue() {
  return fieldValue;
 }

 public void setFieldValue(Object fieldValue) {
  this.fieldValue = fieldValue;
 }
}

