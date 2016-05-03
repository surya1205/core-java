<#if photoList??>
	<#list photoList as photo>
		<tr><td>
		<img src="${photo.url}">
		<p><b>MediaId:</b> ${photo.mediaID!""}</p>
		<p><b>URL:</b> ${photo.url!""}</p>
		<p><b>Badge:</b> ${photo.badge!""}</p>
		<p><b>Likes:</b> ${photo.likes!""}</p>
		<p><b>Liked:</b> ${photo.liked?string!""}</p>
		<p><b>Author:</b> ${photo.author!""}</p>
		<p><b>Location:</b> ${photo.location!""}</p>
		<p><b>Date Posted:</b> ${photo.datePosted!""}</p>
		</td></tr>
	</#list>
</#if>	
