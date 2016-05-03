<#if offerID??>
OfferID is: ${offerID!""}
</#if>
<br/>
<#if itemID??>
itemID is: ${itemID!""}
</#if>
<br/>
<form action="/freemarkersample/spring/team-marlboro/get-a-gift" method="POST">
        <input type="text" name="offerid" value="${offerID!""}">
        <br/>	
        <input type="text" name="itemid" value="${itemID!""}">
        <br/>
        <input type="submit" value="Submit"/>
</form>