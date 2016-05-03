
<footer class="clear">
	<a href="" class="btn alt2 left">Marlboro.com</a>
	<nav class="cf left">
		<ul>
			<!--
			<li><a href="">Help</a></li>
			<li><a href="http://www.philipmorrisusa.com/" target="_blank">philipmorrisusa.com</a></li>
			<li><a href="">Terms of Use</a></li>
			<li><a href="">Privacy Statement</a></li>
			<li><a href="http://www.tobaccoissues.com/" target="_blank">tobaccoissues.com</a></li>
			<li><a href="">Responsibility</a></li>
			-->
			 <#list m_footer.FooterNavigation.footerlink as flink>
                <a href="${flink.url}" <#if !flink_has_next>class="last"</#if>>${flink.name}</a>
                </#list>
		</ul>
	</nav>
	<a href="" class="btn alt2 right">Log Out</a>
	<!-- <p class="clear copyright">&copy; 2012 Philip Morris USA</p> -->
	<p class="clear copyright">${m_footer.FooterNavigation.copyright}</p>
</footer>
