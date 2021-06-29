package com.xmlhttp.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**@JacksonXmlRootElement
 * <User>
 * 	<name>xxx</name>
 * 	<age>10</age>
 * </User>
 */
@JacksonXmlRootElement(localName = "User")
public class User {


    @JacksonXmlProperty(localName = "name")
    private String name;


    @JacksonXmlProperty(localName = "age")
    private Integer age;

}