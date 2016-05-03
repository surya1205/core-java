<header>
    <div class="warning-wrapper">
        <div class="warning"></div>
    </div>

    <div id="logo"><a href=""></a></div>

    <nav class="menu">
        <a href="#"><span class="icn-arrow-down">Menu</span></a>
	<!--
        <ul>
            <li class="icn-black"><a href="">The Black Book</a></li>
            <li><a href="">Major Contest</a></li>
            <li><a href="D_BLK_300_Gallery.html">Photo Stream</a></li>
            <li><a href="D_BLK_400_Products.html">Products</a></li>
        </ul>
	-->
	<ul>
            <#list m_header.global.facets.black.sections as section >
            <li class="<@icon section_index />"><a href="/${section.url}">${section.name}</a></li>
            </#list>
        </ul>
    </nav>
 {global={PageGenerated=/xmlcontent/navigation/global-navigation.xml, facets={gold={sections={name=Gold, url=#}}, red={sections={name=Red, url=#}}, green={sections={name=Green, url=#}}, black={sections=[{name=The Black Book, url=#}, {name=Major Contest, url=#}, {name=Photo Stream, url=#}, {name=Products, url=#}]}}, Header={sections=[{name=Profile, url=#}, {name=Offers, url=#}, {name=Account, url=#}], warningimage=/image/warning.png}}}
    <nav class="util">
        <a href="#"><span class="icn-arrow-down">My Marlboro</span></a>
        <div class="avatar">
            <img src="/images/icn_brand_red.png" width="35" height="35" alt="">
            <span class="notes">3</span>
        </div>
        <ul>
            <li class="icn-profile"><a href="D_MM_200_Social.html">Profile</a><span class="notes">1</span></li>
            <li class="icn-offers"><a href="D_MM_100_Offers.html">Offers</a><span class="notes">2</span></li>
            <li class="icn-account"><a href="D_MM_300_Account.html">Account</a></li>
        </ul>
    </nav>
    
</header>

<!--

<header>
    <div class="warning-wrapper">
        <div class="warning">
            <div id="timer"><div id="timer-indicator"></div></div>
        </div>
    </div>

    <nav class="menu">
        <a href="#">&nbsp;</a>
        <ul>
            <span>Menu</span>
            <li class="icn-black"><a href="">The Black Book</a></li>
            <li><a href="">Enter to Win</a></li>
            <li><a href="">Products</a></li>
        </ul>
        <span class="icn-arrow-down"></span>
    </nav>

    <div id="logo"><a href=""></a></div>

    <nav class="util">
        <a href="#">&nbsp;</a>

        <div class="avatar">
            <img src="/images/icn_brand_red.png" width="35" height="35" alt="">
            <span class="notes">3</span>
        </div>
        <ul>
            <span>My Marlboro</span>
            <li class="icn-profile"><a href="">Link 1</a><span class="notes">1</span></li>
            <li class="icn-offers"><a href="#">Link 2</a><span class="notes">2</span></li>
            <li class="icn-account"><a href="#">Link 2</a></li>
        </ul>
        <span class="icn-arrow-down"></span>
    </nav>

</header>

-->
