<#-- imagehelper.ftl
 
 -->

<#--  

<#macro thumbimg imgsrc extras>
<img src="${imgsrc?replace("lrg","thumb")}" ${extras}>
</#macro>

<#macro smartimg imgsrc extras>
  <#if isMobile()>
    <img src="${imgsrc?replace("lrg","sm")}"  ${extras}>
  <#else>
    <img src="${imgsrc}"  ${extras}>
  </#if>
</#macro>

-->
<#macro icon section_index>
  <#if (section_index = 0) > 
	icn-black
	<#return>
   </#if>
</#macro>

<#function isMobile>
  <#if (deviceatlas.mobileDevice == "1")>
    <#return true>
  <#else>
    <#return false>
  </#if>
</#function>

<#function isTablet>
  <#if (deviceatlas.isTablet == "1")>
    <#return true>
  <#else>
    <#return false>
  </#if>
</#function>

<#function isDesktop>
  <#if (deviceatlas.mobileDevice == "0")>
    <#return true>
  <#else>
    <#return false>
  </#if>
</#function>

<#function isios4or5>
  <#if isMobile() || isTablet()>
  	<#if ((deviceatlas.osiOs == "1") && (deviceatlas.osVersion?starts_with("5")))> 
    	<#return true>
  	</#if>
  </#if>
    <#return false>
  
</#function>
