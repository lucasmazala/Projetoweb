package br.com.projetoweb.bean;

import java.io.FileWriter;
import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObject;

import com.google.gson.Gson;

public class GeoJsonBEAN {

	public void createJson(){
	
	JsonObject creatingJson = Json.createObjectBuilder() //cria objeto {}
			.add("type","FeatureCollection")
			.add("features",Json.createArrayBuilder()// cria o array features []
					.add(Json.createObjectBuilder() // cria objeto {}
					.add("type", "Feature")
					.add("properties", Json.createObjectBuilder()
							.add("id","2500106")
							.add("name", "Água Branca")
							.add("description", "Água Branca"))
					.add("geometry", Json.createObjectBuilder()
							.add("type","Polygon")
							.add("coordinates",Json.createArrayBuilder()
									.add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(-37.7037601546)
													.add( -7.3731762414)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6923221715)
													.add( -7.3789316639)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6719736902)
													.add( -7.3764651899)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6494786532)
													.add( -7.4022367778)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6416503070)
													.add( -7.4119640252)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6119253302)
													.add( -7.4110296802)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6085388856)
													.add( -7.4107184445)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5953212301)
													.add( -7.4170073756)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5929918014)
													.add( -7.4285712765)
													
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5703127562)
													.add( -7.4534823691)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5699295473)
													.add( -7.4539016767)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5681986374)
													.add( -7.4558030883)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5736748347)
													.add( -7.4588626178)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5654147836)
													.add( -7.4825074645)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5714470389)
													.add( -7.4886916125)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5714383226)
													.add( -7.4887060808)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.5863839038)
													.add( -7.4987013277)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6094248480)
													.add( -7.5076244139)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6110274017)
													.add(-7.5181609511)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6195985696)
													.add( -7.5254721440)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6300320777)
													.add( -7.5321036347)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6441957015)
													.add( -7.5294708740)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6494814782)
													.add( -7.5299032733)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6591834592)
													.add(-7.5227299678)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6762883962)
													.add( -7.5352063875)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.6818043504)
													.add(-7.5479685062)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7061598515)
													.add( -7.5501762792)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7097420287)
													.add( -7.5591182880)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7062251895)
													.add(-7.5690591348)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7106646044)
													.add(-7.5733453956)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7206845884)
													.add( -7.5814852006)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7283852612)
													.add( -7.5793224273)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7346032968)
													.add( -7.5968071907)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7494153443)
													.add( -7.5662349877)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7494232327)
													.add( -7.5563271260)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7320730976)
													.add(-7.5448793626)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7270117305)
													.add(-7.5414996609)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7052942352)
													.add(-7.4759948791)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7005479159)
													.add(-7.4616872929)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7109791446)
													.add( -7.4362924428)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7264611165)
													.add( -7.4318823705)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7243169838)
													.add( -7.4087413043)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7269126683)
													.add( -7.3937490633)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7201185461)
													.add( -7.3844369027)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7210160789)
													.add( -7.3819217670)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7111934552)
													.add( -7.3811083963)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7065070986)
													.add( -7.3850485924)
													)//each lat and lng of city	
											.add(Json.createArrayBuilder()
													.add(-37.7037601546)
													.add(-7.3731762414)
													)//each lat and lng of city	
											
											)
																		
									)//array with all lat and lng of a city
							
							
							))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500205")
									.add("name", "Aguiar")
									.add("description", "Aguiar"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-38.2050358822)
															.add( -7.0098057424)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1562922235)
															.add( -7.0094375272)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1322238322)
															.add( -7.0077362418)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0896716242)
															.add( -7.0124371674)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0887476125)
															.add( -7.0146317483)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0582177878)
															.add( -7.0870471685)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0912735245)
															.add( -7.0902680948)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0946079239)
															.add( -7.0907702400)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.0979223255)
															.add( -7.0864594293)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1064438639)
															.add( -7.0875245786)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1236211750)
															.add( -7.0863244389)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1297215025)
															.add( -7.0901588646)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1335411344 )
															.add(-7.0873908030)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1432092027)
															.add( -7.0878412339)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1531707468)
															.add( -7.0989576354)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1605619630)
															.add( -7.1080540878)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1754316203)
															.add( -7.1077982607)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1810008959)
															.add( -7.1185120965)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1867909770)
															.add( -7.1179338574)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1876060414)
															.add( -7.1141185101)
															)//each lat and lng of city	
															
															.add(Json.createArrayBuilder()
															.add(-38.1980996766)
															.add( -7.1203044900)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2041615937)
															.add( -7.1198265415)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2324883693)
															.add( -7.1311331812)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2313189405)
															.add( -7.1463035203)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2271360122)
															.add( -7.1510627406)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.1717592648)
															.add( -7.1605464484)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2300981144)
															.add( -7.1571372734)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2426435124)
															.add( -7.1669086937)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2720321164)
															.add( -7.1774041446)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2912173432)
															.add( -7.1748459785)
															)//each lat and lng of city	
															
															.add(Json.createArrayBuilder()
															.add(-38.2953557028)
															.add( -7.1574942546)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2954837782)
															.add( -7.1564247015)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2944346221)
															.add( -7.1446878671)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2839587381)
															.add( -7.1291007647)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3014740415)
															.add( -7.1272298407)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3309449134)
															.add( -7.1421876326)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3310545726)
															.add( -7.1158690322)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3310906128)
															.add( -7.1070371524)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3312760472)
															.add( -7.1062615273)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3215496995)
															.add( -7.0962323883)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-38.3178999077)
															.add( -7.0839730864)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3095003898)
															.add( -7.0823303145)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3353457964)
															.add( -7.0638536703)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.3223590445)
															.add( -7.0623248647)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2976509033)
															.add( -7.0360412964)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2838564357)
															.add( -7.0116401030)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2771316075)
															.add( -7.0039251053)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2622779384)
															.add( -6.9928333899)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2536951109)
															.add( -6.9942965740)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2299128824)
															.add( -7.0027129498)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-38.2050358822)
															.add( -7.0098057424)
															)//each lat and lng of city	
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500304")
									.add("name", "Alagoa Grande")
									.add("description", "Alagoa Grande"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-35.5346505475)
															.add( -7.0093716626)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5233622552)
															.add( -7.0312944746)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5150219957)
															.add( -7.0304049193)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5101336785)
															.add( -7.0316403711)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5066673223)
															.add( -7.0254842982)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5011092565)
															.add( -7.0259115863)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4968546149)
															.add( -7.0331515734)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4908357036)
															.add( -7.0663608872)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5142762725)
															.add( -7.0620481716)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5111150783)
															.add( -7.0708094162)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5045660490)
															.add( -7.0753756597)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5070399987)
															.add( -7.0838598128)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4999671147)
															.add( -7.0944495536)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5232722771)
															.add( -7.1049027484)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5257881597)
															.add( -7.1095910703)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5267819384)
															.add( -7.1143456721)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5327631394)
															.add( -7.1200591044)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5692125639)
															.add( -7.1223492932)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6134964008)
															.add( -7.1339246106)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6137465071)
															.add( -7.1339891913)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.6241248241)
															.add( -7.1324476198)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6349562850)
															.add( -7.1328783302)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6474554743)
															.add( -7.1449611946)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6527536580)
															.add( -7.1395824016)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6600435817)
															.add( -7.1388730661)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6719276454)
															.add( -7.1469437812)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6802077757)
															.add( -7.1483501235)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6883485083)
															.add( -7.1351344613)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7021518378)
															.add( -7.1127186363)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7076085353)
															.add( -7.1038541885)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.7076321637)
															.add( -7.0900546264)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7109529895)
															.add( -7.0885484665)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7048653458)
															.add( -7.0817522622)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7050764908)
															.add( -7.0728095738)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7011691025)
															.add( -7.0616199212)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6958118279)
															.add( -7.0635179881)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6831847449)
															.add( -7.0462424626)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6713560439)
															.add( -7.0479110331)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6662750709)
															.add( -7.0479110331)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6615063550)
															.add( -7.0343534547)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.6781675386)
															.add( -7.0396372392)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6912455635)
															.add( -7.0356519232)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6927561032)
															.add( -7.0274723261)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6835893640)
															.add( -7.0258058331)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6722474576)
															.add( -7.0171032205)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6653344334)
															.add( -7.0123008639)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6435119834)
															.add( -6.9844860372)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6367477806)
															.add( -6.9803261889)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6125978983)
															.add( -6.9765442596)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6006318676)
															.add( -6.9675365005)
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.5940512624)
															.add( -6.9531636171)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5933637848)
															.add( -6.9478121819)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5803820343)
															.add( -6.9414901535)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5736169361)
															.add( -6.9694796863)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5591649068)
															.add( -6.9772618235)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5588359061)
															.add( -6.9776928493)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5561244650)
															.add( -6.9812447672)
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.5346505475)
															.add( -7.0093716626)
															)//each lat and lng of city	
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500403")
									.add("name", "Alagoa Nova")
									.add("description", "Alagoa Nova"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-35.7956605978)
															.add( -7.0233298805)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7883797878)
															.add( -7.0293064281)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7791899636)
															.add( -7.0273504191)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7677619369)
															.add( -7.0312422082)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7627294431)
															.add( -7.0329511804)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7625969869)
															.add( -7.0330014110)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7553786276)
															.add( -7.0266318508)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7532379256)
															.add( -7.0308638238)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7433885655)
															.add( -7.0291836415)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7355392872)
															.add( -7.0216419455)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7148045463)
															.add( -7.0249944982)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7115744081)
															.add( -7.0232516639)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6927561032)
															.add( -7.0274723261)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6912455635)
															.add( -7.0356519232)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6781675386)
															.add( -7.0396372392)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6615063550)
															.add( -7.0343534547)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6662750709)
															.add( -7.0378623356)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6713560439)
															.add( -7.0479110331)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6831847449)
															.add( -7.0462424626)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.6958118279)
															.add( -7.0635179881)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.7011691025)
															.add( -7.0616199212)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7050764908)
															.add( -7.0728095738)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7048653458)
															.add( -7.0817522622)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7109529895)
															.add( -7.0885484665)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7181033657)
															.add( -7.0906986429)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7213553511)
															.add( -7.0963665631)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7226989493)
															.add( -7.0985387310)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7527146339)
															.add( -7.1080652228)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7692886930)
															.add( -7.1041928811)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7753175562)
															.add( -7.1022350747)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.7947213647)
															.add( -7.1062642298)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7952779261)
															.add( -7.1056326763)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8046841372)
															.add( -7.1014184863)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8133040768)
															.add( -7.1021266577)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8115630306)
															.add( -7.0951624233)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8148092852)
															.add( -7.0847170249)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8178607963)
															.add( -7.0766928318)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8161140022)
															.add( -7.0748868357)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8233490631)
															.add( -7.0718609506)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8268983726)
															.add( -7.0703759472)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.8336970111)
															.add( -7.0601326551)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8418312334)
															.add( -7.0563115351)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8554132450)
															.add( -7.0503150412)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8552084325)
															.add( -7.0501824653)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8406942405)
															.add( -7.0407857583)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8320393219)
															.add( -7.0291156557)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8249941009)
															.add( -7.0302050630)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8092376283)
															.add( -7.0318933640)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8088577222)
															.add( -7.0317905388)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.7956605978)
															.add( -7.0233298805)
															)//each lat and lng of city	
													
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500502")
									.add("name", "Alagoinha")
									.add("description", "Alagoinha"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-35.5634486830)
															.add( -6.9076043834)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5341058468)
															.add( -6.9285429881)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4790274554)
															.add( -6.9231441642)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4723656671)
															.add( -6.9230677367)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4716532950)
															.add( -6.9351610244)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4655591843)
															.add( -6.9522510224)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4584040906)
															.add( -6.9571770768)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4599012842)
															.add( -6.9636597116)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4591823615)
															.add( -6.9737424557)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4633804927)
															.add( -6.9814290715)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.4793948431)
															.add( -6.9898977063)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5189553050)
															.add( -6.9858251289)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5236297008)
															.add( -6.9913924235)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5149435736)
															.add( -7.0057518537)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5197240183)
															.add( -7.0185864313)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5149688670)
															.add( -7.0222883045)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5150219957)
															.add( -7.0304049193)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5233622552)
															.add( -7.0312944746)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5346505475)
															.add(-7.0093716626)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5561244650)
															.add( -6.9812447672)
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.5588359061)
															.add( -6.9776928493)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5591649068)
															.add( -6.9772618235)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5736169361)
															.add( -6.9694796863)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5803820343)
															.add( -6.9414901535)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5797064502)
															.add( -6.9408153063)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5709090537)
															.add( -6.9347516961)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.5823461504)
															.add( -6.9192374662)
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add( -35.5634486830)
															.add(-6.9076043834)
															
															)//each lat and lng of city	
																										
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500536")
									.add("name", "Alcantil")
									.add("description", "Alcantil"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-36.0324031559)
															.add( -7.5869058336)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
													        .add(-36.0210260674)
													        .add(-7.5910291352)
													    		
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0185069404)
															.add(-7.5953065329)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0165736138)
															.add(-7.5882206227)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
													        .add(-36.0061803829)
													        .add(-7.5899572883)
													    		
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0031940834)
															.add(-7.5873931308)
															
															)//each lat and lng of city			
													
													.add(Json.createArrayBuilder()
															.add(-35.9901350890)
															.add(-7.5951224431)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
													        .add(-35.9908626013)
													        .add(-7.6011477913)
													    		
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9758542485)
															.add(-7.6131179374)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9710098363)
															.add(-7.6244536550)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
													        .add(-35.9723886601)
													        .add(-7.6326717450)
													    		
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9625502778)
															.add(-7.6395641932)
															
															)//each lat and lng of city			
													
													.add(Json.createArrayBuilder()
															.add(-35.9650229064)
															.add(-7.6483528374)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
													        .add(-35.9595486527)
													        .add( -7.6522763818)
													    		
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9715608359)
															.add(-7.6683765288)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9770669839)
															.add(-7.6844354807)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9818952442)
															.add( -7.6916985706)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9810059925)
															.add( -7.6942410175)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9744581757)
															.add( -7.6943746337)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9758537185)
															.add( -7.7064008659)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9788403234)
															.add(-7.7052808967)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9809674235)
															.add( -7.7173912689)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9838893681)
															.add( -7.7177114479)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9872736188)
															.add( -7.7263145102)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9851937904)
															.add( -7.7312517063)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9921306337)
															.add( -7.7309717205)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9909948005)
															.add( -7.7367469033)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9849202802)
															.add( -7.7373677087)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9926312446)
															.add( -7.7433361153)
															
															)//each lat and lng of city
													.add(Json.createArrayBuilder()
															.add(-35.9959875690)
															.add( -7.7622220041)
															
															)//each lat and lng of city	
															
														
													
													.add(Json.createArrayBuilder()
															.add(-35.9999859263)
															.add( -7.7628520215)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0053809587)
															.add( -7.7588095241)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0076447567)
															.add( -7.7611669547)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0096626693)
															.add( -7.7578008795)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0110324075)
															.add( -7.7655571930)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0146447591)
															.add( -7.7648952652)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0296866634)
															.add( -7.7857647822)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0312398826)
															.add( -7.7945513919)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0350796276)
															.add( -7.7957804669)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0429152544)
															.add( -7.7932510120)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0535393386)
															.add( -7.8009492758)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0686587292)
															.add( -7.7805620742)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1030394742)
															.add( -7.7790155233)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.1169440105)
															.add( -7.7853746789)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1264876787)
															.add( -7.7837917795)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1273599857)
															.add( -7.7690433309)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1189139809)
															.add( -7.7515969803)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1170649247)
															.add( -7.7344850443)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1071081613)
															.add( -7.7249505338)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1047359573)
															.add( -7.7173203375)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1309031811)
															.add( -7.6679696591)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1262175549)
															.add( -7.6596115640)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1283545606)
															.add( -7.6501457066)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1257164945)
															.add( -7.6442184467)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1314684819)
															.add( -7.6386580715)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1234143155)
															.add( -7.6359785841)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1156065435)
															.add( -7.6407019886)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1098447379)
															.add( -7.6361833676)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1165990409)
															.add( -7.6301544588)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1110005086)
															.add( -7.6230732623)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.1041575143)
															.add( -7.6295475678)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.1034410204)
															.add( -7.6196290967)
															
															)//each lat and lng of city	
															
													
													.add(Json.createArrayBuilder()
															.add(-36.0975462988)
															.add( -7.6237915777)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0963092767)
															.add( -7.6160681342)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0917071928)
															.add( -7.6160635817)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0894164282)
															.add( -7.6125849392)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0873672420)
															.add( -7.6160589669)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0755127127)
															.add( -7.6139363540)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0712920954)
															.add( -7.6129480081)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0713257200)
															.add( -7.6039162326)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0704039976)
															.add( -7.6018894278)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0634672406)
															.add( -7.6079591389)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0629981208)
															.add( -7.6033116302)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0561677671)
															.add( -7.6015283063)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0590350864)
															.add( -7.5972265639)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0552534646)
															.add( -7.5885975559)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0506452361)
															.add( -7.5914325074)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0347504452)
															.add( -7.5887666551)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0324031559)
															.add( -7.5869058336)
															
															)//each lat and lng of city	
													
													)
																				
											)//array with all lat and lng of a city
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500577")
									.add("name", "Algodão de Jandaíra")
									.add("description", "Algodão de Jandaíra"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-35.8390752118)
															.add( -6.8461582901)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.8286198338)
															.add( -6.8563896856)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8098386605)
															.add( -6.8632165272)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8025346948)
															.add( -6.8658928843)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.8071057869)
															.add( -6.8733909152)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8091401945)
															.add( -6.8797710252)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8191453475)
															.add( -6.8738255920)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.8490456359)
															.add( -6.8552950960)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8725391333)
															.add( -6.8613045091)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8929453136)
															.add( -6.8764902335)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9031636009)
															.add( -6.8898914716)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9516181820)
															.add( -6.8900233350)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9449869315)
															.add( -6.9015198699)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9514980948)
															.add( -6.9090603163)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9637691206)
															.add( -6.9222110035)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9798332777)
															.add( -6.9242820519)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9842343959)
															.add( -6.9314330648)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0108278778)
															.add( -6.9437023473)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0108025338)
															.add( -6.9476008025)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0175430481)
															.add( -6.9520884961)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0198829337)
															.add( -6.9614709253)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0489817773)
															.add( -6.9771783566)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0564967846)
															.add( -6.9710007492)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0776573225)
															.add( -6.9707228827)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.1125168163)
															.add( -6.9307651015)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0981420496)
															.add( -6.9234768461)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0713770553)
															.add( -6.9065228024)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-36.0551690406)
															.add( -6.8933914456)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-36.0323937775)
															.add( -6.8815011092)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0244453005)
															.add( -6.8792803685)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-36.0018812769)
															.add( -6.8693562096)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9385682654)
															.add( -6.8285646120)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.9384205860)
															.add( -6.8284506827)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.9232694536)
															.add( -6.8149830764)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.9164554242)
															.add( -6.7957820304)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8973826916)
															.add( -6.7932019355)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8911791291)
															.add( -6.7930344506)
															
															)//each lat and lng of city	
													.add(Json.createArrayBuilder()
															.add(-35.8689794615)
															.add( -6.8165963021)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-35.8440259949)
															.add( -6.8360174944)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-35.8390752118)
															.add( -6.8461582901)
															
															)//each lat and lng of city	
																										
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500601")
									.add("name", "Alhandra")
									.add("description", "Alhandra"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder()
															.add(-34.9260535685)
															.add( -7.2726124545)
															
															)//each lat and lng of city	
															
													.add(Json.createArrayBuilder()
															.add(-34.9199007923) .add(-7.2804215625)
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder()
															.add(-34.9166000368).add( -7.2888658255)
															
															)//each lat and lng of city	
													
													.add(Json.createArrayBuilder().add(-34.9197228681).add(-7.2998165651))
													.add(Json.createArrayBuilder().add(-34.9182491737).add(-7.3031530402))
													.add(Json.createArrayBuilder().add(-34.8806156455).add(-7.3242585613))
													.add(Json.createArrayBuilder().add(-34.8737762864).add(-7.3333962590))
													.add(Json.createArrayBuilder().add(-34.8653278758).add(-7.3383239925))
													.add(Json.createArrayBuilder().add(-34.8595293685).add(-7.3429337252))
													.add(Json.createArrayBuilder().add(-34.8696947164).add(-7.3545029789))
													.add(Json.createArrayBuilder().add(-34.8709134575).add(-7.3607388312))
													.add(Json.createArrayBuilder().add(-34.8740908031).add(-7.3647185995))
													.add(Json.createArrayBuilder().add(-34.8965733410).add(-7.3928826883))
													.add(Json.createArrayBuilder().add(-34.9104988160).add(-7.4103314560))
													.add(Json.createArrayBuilder().add(-34.9007658841).add(-7.4165159739))
													.add(Json.createArrayBuilder().add(-34.8859235692).add(-7.4164138243))
													.add(Json.createArrayBuilder().add(-34.8812188393).add(-7.4169193812))
													.add(Json.createArrayBuilder().add(-34.8708739130).add(-7.4293306332))
													.add(Json.createArrayBuilder().add(-34.8634188592).add(-7.4335125082))
													.add(Json.createArrayBuilder().add(-34.8624415165).add(-7.4290271702))
													.add(Json.createArrayBuilder().add(-34.8489178438).add(-7.4378239775))
													.add(Json.createArrayBuilder().add(-34.8491591007).add(-7.4384676405))
													.add(Json.createArrayBuilder().add(-34.8561512356).add(-7.4390858656))
													.add(Json.createArrayBuilder().add(-34.8602835344).add(-7.4542318085))
													.add(Json.createArrayBuilder().add(-34.8762395304).add(-7.4559934265))
													.add(Json.createArrayBuilder().add(-34.8855577376).add(-7.4594136854))
													.add(Json.createArrayBuilder().add(-34.9063928093).add(-7.4468174471))
													.add(Json.createArrayBuilder().add(-34.9099695187).add(-7.4449270147))
													.add(Json.createArrayBuilder().add(-34.9197225652).add(-7.4393207693))
													.add(Json.createArrayBuilder().add(-34.9240010272).add(-7.4311473973))
													.add(Json.createArrayBuilder().add(-34.9413010400).add(-7.4220347492))
													.add(Json.createArrayBuilder().add(-34.9423707865).add(-7.4162881863))
													.add(Json.createArrayBuilder().add(-34.9542783206).add(-7.4048858196))
													.add(Json.createArrayBuilder().add(-34.9525384277).add(-7.3884927628))
													.add(Json.createArrayBuilder().add(-34.9577747082).add(-7.3810839262))
													.add(Json.createArrayBuilder().add(-34.9673086824).add(-7.3675897691))
													.add(Json.createArrayBuilder().add(-34.9558643801).add(-7.3496907832))
													.add(Json.createArrayBuilder().add(-34.9803747993).add(-7.3282683011))
													.add(Json.createArrayBuilder().add(-34.9833329579).add(-7.3259307809))
													.add(Json.createArrayBuilder().add(-35.0434832383).add(-7.2783739915))
													.add(Json.createArrayBuilder().add(-35.0392765080).add(-7.2764032907))
													.add(Json.createArrayBuilder().add(-35.0174966485).add(-7.2699980664))
													.add(Json.createArrayBuilder().add(-34.9908259108).add(-7.2677072221))
													.add(Json.createArrayBuilder().add(-34.9738052964).add(-7.2738651864))
													.add(Json.createArrayBuilder().add(-34.9686142408).add(-7.2821279821))
													.add(Json.createArrayBuilder().add(-34.9625062761).add(-7.2815668425))
													.add(Json.createArrayBuilder().add(-34.9497229086).add(-7.2753499958))
													.add(Json.createArrayBuilder().add(-34.9435232956).add(-7.2485366770))
													.add(Json.createArrayBuilder().add(-34.9343443695).add(-7.2521088453))
													.add(Json.createArrayBuilder().add(-34.9376346059).add(-7.2609257700))
													.add(Json.createArrayBuilder().add(-34.9392751072).add(-7.2730139086))
													.add(Json.createArrayBuilder().add(-34.9260535685).add(-7.2726124545))
													
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties", Json.createObjectBuilder()
									.add("id","2500700")
									.add("name", "São João do Rio do Peixe")
									.add("description", "São João do Rio do Peixe"))
							.add("geometry", Json.createObjectBuilder()
									.add("type","Polygon")
									.add("coordinates",Json.createArrayBuilder()
											.add(Json.createArrayBuilder()
													.add(Json.createArrayBuilder().add(-38.3478254243).add(-6.5805750917))
													.add(Json.createArrayBuilder().add(-38.3417353376).add(-6.5817249329))
													.add(Json.createArrayBuilder().add(-38.3342689930).add(-6.5779237738))
													.add(Json.createArrayBuilder().add(-38.3424400925).add(-6.5909318139))
													.add(Json.createArrayBuilder().add(-38.3424928223).add(-6.6029837492))
													.add(Json.createArrayBuilder().add(-38.3527355232).add(-6.6143723430))
													.add(Json.createArrayBuilder().add(-38.3526158636).add(-6.6199606188))
													.add(Json.createArrayBuilder().add(-38.3411660131).add(-6.6285062039))
													.add(Json.createArrayBuilder().add(-38.3458748803).add(-6.6365747512))
													.add(Json.createArrayBuilder().add(-38.3505338953).add(-6.6592028521))
													.add(Json.createArrayBuilder().add(-38.3550639475).add(-6.6808108245))
													.add(Json.createArrayBuilder().add(-38.3550693869).add(-6.6812550407))
													.add(Json.createArrayBuilder().add(-38.3552243872).add(-6.6938205775))
													.add(Json.createArrayBuilder().add(-38.3559970342).add(-6.7573914818))
													.add(Json.createArrayBuilder().add(-38.3598930029).add(-6.7621482747))
													.add(Json.createArrayBuilder().add(-38.3721464377).add(-6.7723023590))
													.add(Json.createArrayBuilder().add(-38.3533823361).add(-6.7715254876))
													.add(Json.createArrayBuilder().add(-38.3510717112).add(-6.7939355673))
													.add(Json.createArrayBuilder().add(-38.3517103956).add(-6.7958023531))
													.add(Json.createArrayBuilder().add(-38.3527353818).add(-6.7987935169))
													.add(Json.createArrayBuilder().add(-38.3630974239).add(-6.8241681659))
													.add(Json.createArrayBuilder().add(-38.3637508369).add(-6.8506591896))
													.add(Json.createArrayBuilder().add(-38.3638831828).add(-6.8560203049))
													.add(Json.createArrayBuilder().add(-38.3700873134).add(-6.8639105510))
													.add(Json.createArrayBuilder().add(-38.3577935349).add(-6.8787665424))
													.add(Json.createArrayBuilder().add(-38.3484893157).add(-6.8806515826))
													.add(Json.createArrayBuilder().add(-38.3561632198).add(-6.8953439804))
													.add(Json.createArrayBuilder().add(-38.3631559775).add(-6.9098421449))
													.add(Json.createArrayBuilder().add(-38.3693832790).add(-6.9141304003))
													.add(Json.createArrayBuilder().add(-38.3653752216).add(-6.9196135946))
													.add(Json.createArrayBuilder().add(-38.3673749205).add(-6.9211235705))
													.add(Json.createArrayBuilder().add(-38.3784964415).add(-6.9186995476))
													.add(Json.createArrayBuilder().add(-38.3805834185).add(-6.9238002416))
													.add(Json.createArrayBuilder().add(-38.3829503045).add(-6.9281961480))
													.add(Json.createArrayBuilder().add(-38.4013720707).add(-6.9287780557))
													.add(Json.createArrayBuilder().add(-38.4113312492).add(-6.9258138429))
													.add(Json.createArrayBuilder().add(-38.4263049428).add(-6.9314146267))
													.add(Json.createArrayBuilder().add(-38.4269484086).add(-6.9366146583))
													.add(Json.createArrayBuilder().add(-38.4306525047).add(-6.9118429077))
													.add(Json.createArrayBuilder().add(-38.4324729339).add(-6.8984975015))
													.add(Json.createArrayBuilder().add(-38.4255973063).add(-6.8923256254))
													.add(Json.createArrayBuilder().add(-38.4187140851).add(-6.8670227135))
													.add(Json.createArrayBuilder().add(-38.4186673622).add(-6.8668493292))
													.add(Json.createArrayBuilder().add(-38.4179154383).add(-6.8488973766))
													.add(Json.createArrayBuilder().add(-38.4194472398).add(-6.8365208779))
													.add(Json.createArrayBuilder().add(-38.4228216228).add(-6.8092463392))
													.add(Json.createArrayBuilder().add(-38.4299362808).add(-6.8138904286))
													.add(Json.createArrayBuilder().add(-38.4657615841).add(-6.8098177634))
													.add(Json.createArrayBuilder().add(-38.4947038593).add(-6.8053799110))
													.add(Json.createArrayBuilder().add(-38.5318619234).add(-6.8040618273))
													.add(Json.createArrayBuilder().add(-38.5621792943).add(-6.7964757840))
													.add(Json.createArrayBuilder().add(-38.5468464577).add(-6.7910982546))
													.add(Json.createArrayBuilder().add(-38.5245157926).add(-6.7961187265))
													.add(Json.createArrayBuilder().add(-38.5170942995).add(-6.7970780071))
													.add(Json.createArrayBuilder().add(-38.5089388883).add(-6.7901092334))
													.add(Json.createArrayBuilder().add(-38.4946810559).add(-6.7855584836))
													.add(Json.createArrayBuilder().add(-38.4955897286).add(-6.7691345838))
													.add(Json.createArrayBuilder().add(-38.4890967314).add(-6.7570671230))
													.add(Json.createArrayBuilder().add(-38.4900847514).add(-6.7494191072))
													.add(Json.createArrayBuilder().add(-38.4857355577).add(-6.7370262788))
													.add(Json.createArrayBuilder().add(-38.4896530556).add(-6.7358901860))
													.add(Json.createArrayBuilder().add(-38.4889497306).add(-6.7259050056))
													.add(Json.createArrayBuilder().add(-38.4936802793).add(-6.7199015484))
													.add(Json.createArrayBuilder().add(-38.5027735485).add(-6.7174041532))
													.add(Json.createArrayBuilder().add(-38.5026052144).add(-6.7078529781))
													.add(Json.createArrayBuilder().add(-38.5221235431).add(-6.7039820789))
													.add(Json.createArrayBuilder().add(-38.5193809697).add(-6.6947028444))
													.add(Json.createArrayBuilder().add(-38.5242342699).add(-6.6735119547))
													.add(Json.createArrayBuilder().add(-38.5076717048).add(-6.6718060848))
													.add(Json.createArrayBuilder().add(-38.4966631013).add(-6.6621177167))
													.add(Json.createArrayBuilder().add(-38.4928095555).add(-6.6638297492))
													.add(Json.createArrayBuilder().add(-38.4828768659).add(-6.6598231778))
													.add(Json.createArrayBuilder().add(-38.4754142737).add(-6.6492386925))
													.add(Json.createArrayBuilder().add(-38.4757377952).add(-6.6358980944))
													.add(Json.createArrayBuilder().add(-38.4553532772).add(-6.6081856047))
													.add(Json.createArrayBuilder().add(-38.4492876022).add(-6.5898854630))
													.add(Json.createArrayBuilder().add(-38.4360775304).add(-6.5742868344))
													.add(Json.createArrayBuilder().add(-38.4115326377).add(-6.6011464605))
													.add(Json.createArrayBuilder().add(-38.4098946789).add(-6.5999181573))
													.add(Json.createArrayBuilder().add(-38.3851963646).add(-6.5813997037))
													.add(Json.createArrayBuilder().add(-38.3604806156).add(-6.5684400114))
													.add(Json.createArrayBuilder().add(-38.3486820242).add(-6.5736963236))
													.add(Json.createArrayBuilder().add(-38.3478254243).add(-6.5805750917))
													
													)
																				
											)//array with all lat and lng of a city
									
									
									))// fecha  obj  geometry and obj properties
				
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2500734")
											.add("name", "Amparo")
											.add("description", "Amparo"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
														.add(Json.createArrayBuilder().add(-36.9989847680).add(-7.6059865803))
														.add(Json.createArrayBuilder().add(-36.9818880732).add(-7.6198370213))
														.add(Json.createArrayBuilder().add(-36.9883985737).add(-7.6302923358))
														.add(Json.createArrayBuilder().add(-37.0451941548).add(-7.6086921226))
														.add(Json.createArrayBuilder().add(-37.0596867400).add(-7.6112345895))
														.add(Json.createArrayBuilder().add(-37.0693334308).add(-7.6093129073))
														.add(Json.createArrayBuilder().add(-37.0755468559).add(-7.5994838979))
														.add(Json.createArrayBuilder().add(-37.0856432092).add(-7.5956165829))
														.add(Json.createArrayBuilder().add(-37.0956171532).add(-7.5721604107))
														.add(Json.createArrayBuilder().add(-37.0900567822).add(-7.5688035551))
														.add(Json.createArrayBuilder().add(-37.0937328999).add(-7.5595737034))
														.add(Json.createArrayBuilder().add(-37.0901157805).add(-7.5556734666))
														.add(Json.createArrayBuilder().add(-37.0858548562).add(-7.5173860057))
														.add(Json.createArrayBuilder().add(-37.0679671022).add(-7.5167010248))
														.add(Json.createArrayBuilder().add(-37.0534817101).add(-7.5041609336))
														.add(Json.createArrayBuilder().add(-37.0428169374).add(-7.5035063787))
														.add(Json.createArrayBuilder().add(-37.0300750156).add(-7.4980301268))
														.add(Json.createArrayBuilder().add(-37.0258208031).add(-7.4969170904))
														.add(Json.createArrayBuilder().add(-37.0256476016).add(-7.4968040162))
														.add(Json.createArrayBuilder().add(-37.0248620480).add(-7.4962901868))
														.add(Json.createArrayBuilder().add(-37.0228562355).add(-7.5017739102))
														.add(Json.createArrayBuilder().add(-37.0117818496).add(-7.5039765933))
														.add(Json.createArrayBuilder().add(-36.9781543215).add(-7.5427202894))
														.add(Json.createArrayBuilder().add(-37.0001923326).add(-7.5638960688))
														.add(Json.createArrayBuilder().add(-37.0020548513).add(-7.5675668823))
														.add(Json.createArrayBuilder().add(-36.9988807334).add(-7.5747199522))
														.add(Json.createArrayBuilder().add(-37.0018400152).add(-7.5794109157))
														.add(Json.createArrayBuilder().add(-36.9982859667).add(-7.5848213990))
														.add(Json.createArrayBuilder().add(-36.9989847680).add(-7.6059865803))
														
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2500775")
											.add("name", "Aparecida")
											.add("description", "Aparecida"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.0161044794).add(-6.6700685080))
											.add(Json.createArrayBuilder().add(-38.0115638266).add(-6.6749909917))
											.add(Json.createArrayBuilder().add(-37.9978282153).add(-6.6767427480))
											.add(Json.createArrayBuilder().add(-37.9828286787).add(-6.6964928680))
											.add(Json.createArrayBuilder().add(-37.9858326594).add(-6.7115263199))
											.add(Json.createArrayBuilder().add(-38.0288224163).add(-6.7171782945))
											.add(Json.createArrayBuilder().add(-38.0245193405).add(-6.7635729892))
											.add(Json.createArrayBuilder().add(-38.0245081480).add(-6.7636902346))
											.add(Json.createArrayBuilder().add(-38.0162063413).add(-6.7716750106))
											.add(Json.createArrayBuilder().add(-38.0141355327).add(-6.7807277539))
											.add(Json.createArrayBuilder().add(-38.0163297369).add(-6.7881039402))
											.add(Json.createArrayBuilder().add(-38.0096804199).add(-6.7972514123))
											.add(Json.createArrayBuilder().add(-37.9998670856).add(-6.8164038914))
											.add(Json.createArrayBuilder().add(-37.9897957027).add(-6.8265673316))
											.add(Json.createArrayBuilder().add(-37.9949656636).add(-6.8281732367))
											.add(Json.createArrayBuilder().add(-38.0026594815).add(-6.8238235800))
											.add(Json.createArrayBuilder().add(-38.0099638006).add(-6.8309059606))
											.add(Json.createArrayBuilder().add(-38.0100276125).add(-6.8310787281))
											.add(Json.createArrayBuilder().add(-38.0116264443).add(-6.8478125864))
											.add(Json.createArrayBuilder().add(-38.0008202968).add(-6.8553431219))
											.add(Json.createArrayBuilder().add(-37.9971619818).add(-6.8724919698))
											.add(Json.createArrayBuilder().add(-38.0142942152).add(-6.8842633767))
											.add(Json.createArrayBuilder().add(-38.0263064887).add(-6.8813639952))
											.add(Json.createArrayBuilder().add(-38.0301161473).add(-6.8871646812))
											.add(Json.createArrayBuilder().add(-38.0406438107).add(-6.8872733140))
											.add(Json.createArrayBuilder().add(-38.0681991423).add(-6.8793419511))
											.add(Json.createArrayBuilder().add(-38.0888705355).add(-6.8870226480))
											.add(Json.createArrayBuilder().add(-38.1053463040).add(-6.8866975431))
											.add(Json.createArrayBuilder().add(-38.1227888593).add(-6.8972219163))
											.add(Json.createArrayBuilder().add(-38.1339104201).add(-6.8924272375))
											.add(Json.createArrayBuilder().add(-38.1505283788).add(-6.8951327189))
											.add(Json.createArrayBuilder().add(-38.1371767226).add(-6.8723825327))
											.add(Json.createArrayBuilder().add(-38.1329855876).add(-6.8713903003))
											.add(Json.createArrayBuilder().add(-38.1309107518).add(-6.8600409595))
											.add(Json.createArrayBuilder().add(-38.1189089645).add(-6.8531936146))
											.add(Json.createArrayBuilder().add(-38.1295132782).add(-6.8176229612))
											.add(Json.createArrayBuilder().add(-38.1355955993).add(-6.7875385459))
											.add(Json.createArrayBuilder().add(-38.1396923821).add(-6.7530403645))
											.add(Json.createArrayBuilder().add(-38.1014748792).add(-6.7229457386))
											.add(Json.createArrayBuilder().add(-38.0915665508).add(-6.6887772022))
											.add(Json.createArrayBuilder().add(-38.0870880937).add(-6.6884259368))
											.add(Json.createArrayBuilder().add(-38.0861134553).add(-6.6845556015))
											.add(Json.createArrayBuilder().add(-38.0690094027).add(-6.6727407018))
											.add(Json.createArrayBuilder().add(-38.0487929796).add(-6.6752692683))
											.add(Json.createArrayBuilder().add(-38.0386555042).add(-6.6685991205))
											.add(Json.createArrayBuilder().add(-38.0161044794).add(-6.6700685080))
																					
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2500809")
											.add("name", "Araçagi")
											.add("description", "Araçagi"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.3230058364).add(-6.7985253596))
											.add(Json.createArrayBuilder().add(-35.3274253104).add(-6.8244819941))
											.add(Json.createArrayBuilder().add(-35.3056146273).add(-6.8315462608))
											.add(Json.createArrayBuilder().add(-35.3001012623).add(-6.8512003731))
											.add(Json.createArrayBuilder().add(-35.3184527943).add(-6.8604124659))
											.add(Json.createArrayBuilder().add(-35.3157630005).add(-6.8713660014))
											.add(Json.createArrayBuilder().add(-35.3053186031).add(-6.8836412385))
											.add(Json.createArrayBuilder().add(-35.3052150940).add(-6.8960144416))
											.add(Json.createArrayBuilder().add(-35.3015403047).add(-6.9033742994))
											.add(Json.createArrayBuilder().add(-35.3020311726).add(-6.9082488051))
											.add(Json.createArrayBuilder().add(-35.2957394115).add(-6.9130112626))
											.add(Json.createArrayBuilder().add(-35.2922314479).add(-6.9252910774))
											.add(Json.createArrayBuilder().add(-35.2871657040).add(-6.9430160514))
											.add(Json.createArrayBuilder().add(-35.2774772772).add(-6.9425788725))
											.add(Json.createArrayBuilder().add(-35.2739439928).add(-6.9475649024))
											.add(Json.createArrayBuilder().add(-35.2662136561).add(-6.9525099134))
											.add(Json.createArrayBuilder().add(-35.2628300031).add(-6.9547657269))
											.add(Json.createArrayBuilder().add(-35.2622604272).add(-6.9550287569))
											.add(Json.createArrayBuilder().add(-35.2626917993).add(-6.9554187901))
											.add(Json.createArrayBuilder().add(-35.2776232712).add(-6.9689116297))
											.add(Json.createArrayBuilder().add(-35.3159501129).add(-6.9849464993))
											.add(Json.createArrayBuilder().add(-35.3168474055).add(-6.9850628104))
											.add(Json.createArrayBuilder().add(-35.3168920054).add(-6.9849252343))
											.add(Json.createArrayBuilder().add(-35.3406465335).add(-6.9559625740))
											.add(Json.createArrayBuilder().add(-35.3427903930).add(-6.9420055731))
											.add(Json.createArrayBuilder().add(-35.3456065608).add(-6.9410791785))
											.add(Json.createArrayBuilder().add(-35.3624570508).add(-6.9397234179))
											.add(Json.createArrayBuilder().add(-35.3809905041).add(-6.9325420428))
											.add(Json.createArrayBuilder().add(-35.3821683747).add(-6.9236526485))
											.add(Json.createArrayBuilder().add(-35.3843425351).add(-6.9014393463))
											.add(Json.createArrayBuilder().add(-35.3851145693).add(-6.8935415875))
											.add(Json.createArrayBuilder().add(-35.3887513431).add(-6.8562899609))
											.add(Json.createArrayBuilder().add(-35.3917630799).add(-6.8539149577))
											.add(Json.createArrayBuilder().add(-35.3895420061).add(-6.8483685735))
											.add(Json.createArrayBuilder().add(-35.3931420948).add(-6.8454965587))
											.add(Json.createArrayBuilder().add(-35.3981825879).add(-6.8466897654))
											.add(Json.createArrayBuilder().add(-35.3999196761).add(-6.8442822052))
											.add(Json.createArrayBuilder().add(-35.4026106961).add(-6.8476884755))
											.add(Json.createArrayBuilder().add(-35.4034557843).add(-6.8454209112))
											.add(Json.createArrayBuilder().add(-35.4060902492).add(-6.8325126089))
											.add(Json.createArrayBuilder().add(-35.4096093457).add(-6.8350952142))
											.add(Json.createArrayBuilder().add(-35.4114056578).add(-6.8303160030))
											.add(Json.createArrayBuilder().add(-35.4155883932).add(-6.8309062429))
											.add(Json.createArrayBuilder().add(-35.4188534033).add(-6.8325309670))
											.add(Json.createArrayBuilder().add(-35.4174085223).add(-6.8247998530))
											.add(Json.createArrayBuilder().add(-35.4223016491).add(-6.8226974127))
											.add(Json.createArrayBuilder().add(-35.4184077548).add(-6.8132985944))
											.add(Json.createArrayBuilder().add(-35.4279982104).add(-6.8151542949))
											.add(Json.createArrayBuilder().add(-35.4298317338).add(-6.8128983090))
											.add(Json.createArrayBuilder().add(-35.4591752851).add(-6.8210880368))
											.add(Json.createArrayBuilder().add(-35.4644954662).add(-6.8116522811))
											.add(Json.createArrayBuilder().add(-35.4615369380).add(-6.8093723556))
											.add(Json.createArrayBuilder().add(-35.4464301537).add(-6.7920865938))
											.add(Json.createArrayBuilder().add(-35.4352887124).add(-6.7873435408))
											.add(Json.createArrayBuilder().add(-35.4237552999).add(-6.7768708586))
											.add(Json.createArrayBuilder().add(-35.4170079777).add(-6.7743473542))
											.add(Json.createArrayBuilder().add(-35.4085846140).add(-6.7654595887))
											.add(Json.createArrayBuilder().add(-35.3904156043).add(-6.7611671715))
											.add(Json.createArrayBuilder().add(-35.3741391204).add(-6.7559962446))
											.add(Json.createArrayBuilder().add(-35.3725695174).add(-6.7554697613))
											.add(Json.createArrayBuilder().add(-35.3720513709).add(-6.7552961710))
											.add(Json.createArrayBuilder().add(-35.3585300692).add(-6.7569891783))
											.add(Json.createArrayBuilder().add(-35.3503209281).add(-6.7741644032))
											.add(Json.createArrayBuilder().add(-35.3501693015).add(-6.7742439805))
											.add(Json.createArrayBuilder().add(-35.3402101607).add(-6.7794166633))
											.add(Json.createArrayBuilder().add(-35.3248114867).add(-6.7794651882))
											.add(Json.createArrayBuilder().add(-35.3207696880).add(-6.7884897256))
											.add(Json.createArrayBuilder().add(-35.3157870494).add(-6.7885565668))
											.add(Json.createArrayBuilder().add(-35.3230058364).add(-6.7985253596))
											
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2500908")
											.add("name", "Arara")
											.add("description", "Arara"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.7290981952).add(-6.8168585546))
											.add(Json.createArrayBuilder().add(-35.7197466169).add(-6.8247940569))
											.add(Json.createArrayBuilder().add(-35.7158930943).add(-6.8206738291))
											.add(Json.createArrayBuilder().add(-35.7057702220).add(-6.8192086799))
											.add(Json.createArrayBuilder().add(-35.7019159792).add(-6.8146692947))
											.add(Json.createArrayBuilder().add(-35.7005482297).add(-6.8143185133))
											.add(Json.createArrayBuilder().add(-35.7016003466).add(-6.8328533688))
											.add(Json.createArrayBuilder().add(-35.7088167654).add(-6.8408222491))
											.add(Json.createArrayBuilder().add(-35.6991427641).add(-6.8460910213))
											.add(Json.createArrayBuilder().add(-35.6925618672).add(-6.8598065076))
											.add(Json.createArrayBuilder().add(-35.6875878498).add(-6.8618159399))
											.add(Json.createArrayBuilder().add(-35.6781400786).add(-6.8673277702))
											.add(Json.createArrayBuilder().add(-35.6739878146).add(-6.8662982764))
											.add(Json.createArrayBuilder().add(-35.6585728146).add(-6.8676978993))
											.add(Json.createArrayBuilder().add(-35.6530458637).add(-6.8816716928))
											.add(Json.createArrayBuilder().add(-35.6457401281).add(-6.8823004423))
											.add(Json.createArrayBuilder().add(-35.6452514251).add(-6.8830007088))
											.add(Json.createArrayBuilder().add(-35.6497438936).add(-6.9096255856))
											.add(Json.createArrayBuilder().add(-35.6562589182).add(-6.9098333751))
											.add(Json.createArrayBuilder().add(-35.6594036341).add(-6.9069510486))
											.add(Json.createArrayBuilder().add(-35.6694839840).add(-6.8999374062))
											.add(Json.createArrayBuilder().add(-35.6797541146).add(-6.8907285307))
											.add(Json.createArrayBuilder().add(-35.7213699185).add(-6.8938485008))
											.add(Json.createArrayBuilder().add(-35.7268525859).add(-6.8942593451))
											.add(Json.createArrayBuilder().add(-35.7298524312).add(-6.8926587063))
											.add(Json.createArrayBuilder().add(-35.7500686021).add(-6.8826998377))
											.add(Json.createArrayBuilder().add(-35.7647023378).add(-6.8832305397))
											.add(Json.createArrayBuilder().add(-35.7672582596).add(-6.8747849583))
											.add(Json.createArrayBuilder().add(-35.7751389633).add(-6.8760762156))
											.add(Json.createArrayBuilder().add(-35.7829524386).add(-6.8735340691))
											.add(Json.createArrayBuilder().add(-35.7857690744).add(-6.8726176099))
											.add(Json.createArrayBuilder().add(-35.8004595796).add(-6.8640926589))
											.add(Json.createArrayBuilder().add(-35.8025346948).add(-6.8658928843))
											.add(Json.createArrayBuilder().add(-35.8098386605).add(-6.8632165272))
											.add(Json.createArrayBuilder().add(-35.8081480236).add(-6.8476108787))
											.add(Json.createArrayBuilder().add(-35.8116419626).add(-6.8429582544))
											.add(Json.createArrayBuilder().add(-35.8063305145).add(-6.8407753981))
											.add(Json.createArrayBuilder().add(-35.8050651422).add(-6.8341693296))
											.add(Json.createArrayBuilder().add(-35.7961434129).add(-6.8339266236))
											.add(Json.createArrayBuilder().add(-35.7920015004).add(-6.8263299285))
											.add(Json.createArrayBuilder().add(-35.7865216196).add(-6.8237796007))
											.add(Json.createArrayBuilder().add(-35.7624192243).add(-6.8237548833))
											.add(Json.createArrayBuilder().add(-35.7591982100).add(-6.8241678771))
											.add(Json.createArrayBuilder().add(-35.7549548456).add(-6.8245172994))
											.add(Json.createArrayBuilder().add(-35.7521564823).add(-6.8249333855))
											.add(Json.createArrayBuilder().add(-35.7422229310).add(-6.8131222274))
											.add(Json.createArrayBuilder().add(-35.7290981952).add(-6.8168585546))

											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501005")
											.add("name", "Araruna")
											.add("description", "Araruna"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.6569367064).add(-6.4453819066))
											.add(Json.createArrayBuilder().add(-35.6364723379).add(-6.4539882100))
											.add(Json.createArrayBuilder().add(-35.6531094450).add(-6.4914300143))
											.add(Json.createArrayBuilder().add(-35.6639579185).add(-6.5004002031))
											.add(Json.createArrayBuilder().add(-35.6871057958).add(-6.5335636313))
											.add(Json.createArrayBuilder().add(-35.6917131059).add(-6.5543107263))
											.add(Json.createArrayBuilder().add(-35.7127032285).add(-6.5654191810))
											.add(Json.createArrayBuilder().add(-35.7207800759).add(-6.5655482335))
											.add(Json.createArrayBuilder().add(-35.7192582071).add(-6.5686889981))
											.add(Json.createArrayBuilder().add(-35.7083448933).add(-6.5891506541))
											.add(Json.createArrayBuilder().add(-35.6898150536).add(-6.5907318172))
											.add(Json.createArrayBuilder().add(-35.7068130267).add(-6.5994578708))
											.add(Json.createArrayBuilder().add(-35.7182399054).add(-6.6013625549))
											.add(Json.createArrayBuilder().add(-35.7225586762).add(-6.6109998525))
											.add(Json.createArrayBuilder().add(-35.7345980285).add(-6.6135337173))
											.add(Json.createArrayBuilder().add(-35.7366619600).add(-6.6013468271))
											.add(Json.createArrayBuilder().add(-35.7402987005).add(-6.5970212271))
											.add(Json.createArrayBuilder().add(-35.7491485731).add(-6.5975158235))
											.add(Json.createArrayBuilder().add(-35.7553527120).add(-6.5920981519))
											.add(Json.createArrayBuilder().add(-35.7765828074).add(-6.5958015695))
											.add(Json.createArrayBuilder().add(-35.7768839051).add(-6.5956397380))
											.add(Json.createArrayBuilder().add(-35.8098577911).add(-6.5779781769))
											.add(Json.createArrayBuilder().add(-35.8209402367).add(-6.5733002377))
											.add(Json.createArrayBuilder().add(-35.8308707043).add(-6.5637169687))
											.add(Json.createArrayBuilder().add(-35.8587410615).add(-6.5466670052))
											.add(Json.createArrayBuilder().add(-35.8678627976).add(-6.5453818687))
											.add(Json.createArrayBuilder().add(-35.8527620140).add(-6.4872133556))
											.add(Json.createArrayBuilder().add(-35.8169904781).add(-6.4850935881))
											.add(Json.createArrayBuilder().add(-35.7823015101).add(-6.4830359421))
											.add(Json.createArrayBuilder().add(-35.7795980783).add(-6.4828754057))
											.add(Json.createArrayBuilder().add(-35.7729957797).add(-6.4824436199))
											.add(Json.createArrayBuilder().add(-35.7498993031).add(-6.4780910502))
											.add(Json.createArrayBuilder().add(-35.7432332578).add(-6.4734845070))
											.add(Json.createArrayBuilder().add(-35.7408275535).add(-6.4759035395))
											.add(Json.createArrayBuilder().add(-35.7258641158).add(-6.4692113422))
											.add(Json.createArrayBuilder().add(-35.7215288528).add(-6.4712651883))
											.add(Json.createArrayBuilder().add(-35.7109289801).add(-6.4706936789))
											.add(Json.createArrayBuilder().add(-35.6978539043).add(-6.4624908657))
											.add(Json.createArrayBuilder().add(-35.6816459178).add(-6.4475281010))
											.add(Json.createArrayBuilder().add(-35.6710208669).add(-6.4513235205))
											.add(Json.createArrayBuilder().add(-35.6648305230).add(-6.4501145669))
											.add(Json.createArrayBuilder().add(-35.6632768181).add(-6.4464296994))
											.add(Json.createArrayBuilder().add(-35.6569367064).add(-6.4453819066))

											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501104")
											.add("name", "Areia")
											.add("description", "Areia"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.7829524386).add(-6.8735340691))
											.add(Json.createArrayBuilder().add(-35.7751389633).add(-6.8760762156))
											.add(Json.createArrayBuilder().add(-35.7672582596).add(-6.8747849583))
											.add(Json.createArrayBuilder().add(-35.7647023378).add(-6.8832305397))
											.add(Json.createArrayBuilder().add(-35.7500686021).add(-6.8826998377))
											.add(Json.createArrayBuilder().add(-35.7298524312).add(-6.8926587063))
											.add(Json.createArrayBuilder().add(-35.7268525859).add(-6.8942593451))
											.add(Json.createArrayBuilder().add(-35.7213699185).add(-6.8938485008))
											.add(Json.createArrayBuilder().add(-35.6797541146).add(-6.8907285307))
											.add(Json.createArrayBuilder().add(-35.6694839840).add(-6.8999374062))
											.add(Json.createArrayBuilder().add(-35.6594036341).add(-6.9069510486))
											.add(Json.createArrayBuilder().add(-35.6562589182).add(-6.9098333751))
											.add(Json.createArrayBuilder().add(-35.6497438936).add(-6.9096255856))
											.add(Json.createArrayBuilder().add(-35.6494742483).add(-6.9095752304))
											.add(Json.createArrayBuilder().add(-35.6133478392).add(-6.9162340029))
											.add(Json.createArrayBuilder().add(-35.6045419182).add(-6.9171301195))
											.add(Json.createArrayBuilder().add(-35.5828006983).add(-6.9191930912))
											.add(Json.createArrayBuilder().add(-35.5823461504).add(-6.9192374662))
											.add(Json.createArrayBuilder().add(-35.5709090537).add(-6.9347516961))
											.add(Json.createArrayBuilder().add(-35.5797064502).add(-6.9408153063))
											.add(Json.createArrayBuilder().add(-35.5803820343).add(-6.9414901535))
											.add(Json.createArrayBuilder().add(-35.5933637848).add(-6.9478121819))
											.add(Json.createArrayBuilder().add(-35.5940512624).add(-6.9531636171))
											.add(Json.createArrayBuilder().add(-35.6006318676).add(-6.9675365005))
											.add(Json.createArrayBuilder().add(-35.6125978983).add(-6.9765442596))
											.add(Json.createArrayBuilder().add(-35.6367477806).add(-6.9803261889))
											.add(Json.createArrayBuilder().add(-35.6435119834).add(-6.9844860372))
											.add(Json.createArrayBuilder().add(-35.6653344334).add(-7.0123008639))
											.add(Json.createArrayBuilder().add(-35.6722474576).add(-7.0171032205))
											.add(Json.createArrayBuilder().add(-35.6835893640).add(-7.0258058331))
											.add(Json.createArrayBuilder().add(-35.6927561032).add(-7.0274723261))
											.add(Json.createArrayBuilder().add(-35.7115744081).add(-7.0232516639))
											.add(Json.createArrayBuilder().add(-35.7148045463).add(-7.0249944982))
											.add(Json.createArrayBuilder().add(-35.7355392872).add(-7.0216419455))
											.add(Json.createArrayBuilder().add(-35.7433885655).add(-7.0291836415))
											.add(Json.createArrayBuilder().add(-35.7532379256).add(-7.0308638238))
											.add(Json.createArrayBuilder().add(-35.7553786276).add(-7.0266318508))
											.add(Json.createArrayBuilder().add(-35.7625969869).add(-7.0330014110))
											.add(Json.createArrayBuilder().add(-35.7627294431).add(-7.0329511804))
											.add(Json.createArrayBuilder().add(-35.7677619369).add(-7.0312422082))
											.add(Json.createArrayBuilder().add(-35.7791899636).add(-7.0273504191))
											.add(Json.createArrayBuilder().add(-35.7784744811).add(-7.0211378541))
											.add(Json.createArrayBuilder().add(-35.7820793341).add(-7.0185473838))
											.add(Json.createArrayBuilder().add(-35.7777519113).add(-7.0033251322))
											.add(Json.createArrayBuilder().add(-35.7747300799).add(-6.9955008241))
											.add(Json.createArrayBuilder().add(-35.7741210188).add(-6.9888220425))
											.add(Json.createArrayBuilder().add(-35.7760685634).add(-6.9840400245))
											.add(Json.createArrayBuilder().add(-35.7760398081).add(-6.9837175646))
											.add(Json.createArrayBuilder().add(-35.7741289262).add(-6.9619369933))
											.add(Json.createArrayBuilder().add(-35.7910733946).add(-6.9377316149))
											.add(Json.createArrayBuilder().add(-35.7914976214).add(-6.9363071859))
											.add(Json.createArrayBuilder().add(-35.7920014918).add(-6.9150334041))
											.add(Json.createArrayBuilder().add(-35.7927869310).add(-6.8961258232))
											.add(Json.createArrayBuilder().add(-35.8071057869).add(-6.8733909152))
											.add(Json.createArrayBuilder().add(-35.8025346948).add(-6.8658928843))
											.add(Json.createArrayBuilder().add(-35.8004595796).add(-6.8640926589))
											.add(Json.createArrayBuilder().add(-35.7857690744).add(-6.8726176099))
											.add(Json.createArrayBuilder().add(-35.7829524386).add(-6.8735340691))
										
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501153")
											.add("name", "Areia de Baraúnas")
											.add("description", "Areia de Baraúnas"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.9372137270).add(-7.0468128594))
											.add(Json.createArrayBuilder().add(-36.9292502974).add(-7.0574657417))
											.add(Json.createArrayBuilder().add(-36.9162871990).add(-7.0802206219))
											.add(Json.createArrayBuilder().add(-36.9224374789).add(-7.0872714597))
											.add(Json.createArrayBuilder().add(-36.9237597069).add(-7.1051281228))
											.add(Json.createArrayBuilder().add(-36.9321825894).add(-7.1094788850))
											.add(Json.createArrayBuilder().add(-36.9232506243).add(-7.1175824733))
											.add(Json.createArrayBuilder().add(-36.9259157694).add(-7.1217665774))
											.add(Json.createArrayBuilder().add(-36.9309514101).add(-7.1496673493))
											.add(Json.createArrayBuilder().add(-36.9440986424).add(-7.1513637463))
											.add(Json.createArrayBuilder().add(-36.9543383262).add(-7.1485170678))
											.add(Json.createArrayBuilder().add(-36.9544817312).add(-7.1485100146))
											.add(Json.createArrayBuilder().add(-36.9638642499).add(-7.1503655168))
											.add(Json.createArrayBuilder().add(-36.9763231426).add(-7.1600619449))
											.add(Json.createArrayBuilder().add(-36.9922790804).add(-7.1797157610))
											.add(Json.createArrayBuilder().add(-37.0016016257).add(-7.1753310739))
											.add(Json.createArrayBuilder().add(-36.9999303331).add(-7.1739018906))
											.add(Json.createArrayBuilder().add(-36.9952661987).add(-7.1682370608))
											.add(Json.createArrayBuilder().add(-36.9939238879).add(-7.1570434866))
											.add(Json.createArrayBuilder().add(-36.9960960481).add(-7.1479415376))
											.add(Json.createArrayBuilder().add(-37.0028990745).add(-7.1450711684))
											.add(Json.createArrayBuilder().add(-36.9996592360).add(-7.1359285792))
											.add(Json.createArrayBuilder().add(-37.0031358630).add(-7.1307563951))
											.add(Json.createArrayBuilder().add(-37.0045020244).add(-7.1273399478))
											.add(Json.createArrayBuilder().add(-36.9951274886).add(-7.1263757366))
											.add(Json.createArrayBuilder().add(-36.9934177766).add(-7.1195313946))
											.add(Json.createArrayBuilder().add(-37.0056870846).add(-7.0746496499))
											.add(Json.createArrayBuilder().add(-37.0065939758).add(-7.0520879186))
											.add(Json.createArrayBuilder().add(-37.0048936774).add(-7.0514676731))
											.add(Json.createArrayBuilder().add(-36.9971036147).add(-7.0608704781))
											.add(Json.createArrayBuilder().add(-36.9930782571).add(-7.0612872989))
											.add(Json.createArrayBuilder().add(-36.9753641627).add(-7.0569240064))
											.add(Json.createArrayBuilder().add(-36.9590771961).add(-7.0476638517))
											.add(Json.createArrayBuilder().add(-36.9481996230).add(-7.0477604058))
											.add(Json.createArrayBuilder().add(-36.9434942182).add(-7.0445666196))
											.add(Json.createArrayBuilder().add(-36.9372137270).add(-7.0468128594))
						
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501203")
											.add("name", "Areial")
											.add("description", "Areial"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.9528762247).add(-7.0146885697))
											.add(Json.createArrayBuilder().add(-35.9468113321).add(-7.0195632534))
											.add(Json.createArrayBuilder().add(-35.9278397228).add(-7.0172087021))
											.add(Json.createArrayBuilder().add(-35.9270171159).add(-7.0173276919))
											.add(Json.createArrayBuilder().add(-35.9147589652).add(-7.0286073583))
											.add(Json.createArrayBuilder().add(-35.9109125459).add(-7.0325883925))
											.add(Json.createArrayBuilder().add(-35.9037115114).add(-7.0388651073))
											.add(Json.createArrayBuilder().add(-35.9026486199).add(-7.0455911067))
											.add(Json.createArrayBuilder().add(-35.9028645890).add(-7.0555183943))
											.add(Json.createArrayBuilder().add(-35.9120762893).add(-7.0705263211))
											.add(Json.createArrayBuilder().add(-35.9219519295).add(-7.0800058282))
											.add(Json.createArrayBuilder().add(-35.9271852346).add(-7.0783791940))
											.add(Json.createArrayBuilder().add(-35.9616235167).add(-7.0688527572))
											.add(Json.createArrayBuilder().add(-35.9623975416).add(-7.0686380954))
											.add(Json.createArrayBuilder().add(-35.9626250440).add(-7.0686119910))
											.add(Json.createArrayBuilder().add(-35.9692456356).add(-7.0678678162))
											.add(Json.createArrayBuilder().add(-35.9652429174).add(-7.0620964489))
											.add(Json.createArrayBuilder().add(-35.9582937503).add(-7.0593984754))
											.add(Json.createArrayBuilder().add(-35.9586534799).add(-7.0456454300))
											.add(Json.createArrayBuilder().add(-35.9501391237).add(-7.0291515734))
											.add(Json.createArrayBuilder().add(-35.9555065644).add(-7.0242186816))
											.add(Json.createArrayBuilder().add(-35.9625672569).add(-7.0244104351))
											.add(Json.createArrayBuilder().add(-35.9570265280).add(-7.0167976172))
											.add(Json.createArrayBuilder().add(-35.9568698300).add(-7.0164563704))
											.add(Json.createArrayBuilder().add(-35.9528762247).add(-7.0146885697))
									
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501302")
											.add("name", "Aroeiras")
											.add("description", "Aroeiras"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.5836457016).add(-7.4501839801))
											.add(Json.createArrayBuilder().add(-35.5821727015).add(-7.4616659414))
											.add(Json.createArrayBuilder().add(-35.5881267001).add(-7.4808300723))
											.add(Json.createArrayBuilder().add(-35.5911545253).add(-7.4886641970))
											.add(Json.createArrayBuilder().add(-35.5922681074).add(-7.5047518498))
											.add(Json.createArrayBuilder().add(-35.5950704692).add(-7.5248998920))
											.add(Json.createArrayBuilder().add(-35.5950759344).add(-7.5250241003))
											.add(Json.createArrayBuilder().add(-35.5943174901).add(-7.5401110654))
											.add(Json.createArrayBuilder().add(-35.6019248082).add(-7.5526756919))
											.add(Json.createArrayBuilder().add(-35.6006975577).add(-7.5788093442))
											.add(Json.createArrayBuilder().add(-35.5999911233).add(-7.5887135167))
											.add(Json.createArrayBuilder().add(-35.5897808236).add(-7.6044061550))
											.add(Json.createArrayBuilder().add(-35.5949693423).add(-7.6164915714))
											.add(Json.createArrayBuilder().add(-35.5974155513).add(-7.6179337844))
											.add(Json.createArrayBuilder().add(-35.6101597023).add(-7.6177558448))
											.add(Json.createArrayBuilder().add(-35.6165449461).add(-7.6058102863))
											.add(Json.createArrayBuilder().add(-35.6240577793).add(-7.6080415501))
											.add(Json.createArrayBuilder().add(-35.6341121956).add(-7.6122520310))
											.add(Json.createArrayBuilder().add(-35.6519486156).add(-7.6124389970))
											.add(Json.createArrayBuilder().add(-35.6578419111).add(-7.6191797179))
											.add(Json.createArrayBuilder().add(-35.6701195118).add(-7.6219979616))
											.add(Json.createArrayBuilder().add(-35.6749446695).add(-7.6268140732))
											.add(Json.createArrayBuilder().add(-35.6766935176).add(-7.6361063455))
											.add(Json.createArrayBuilder().add(-35.6852772047).add(-7.6408094086))
											.add(Json.createArrayBuilder().add(-35.7111721689).add(-7.6415263749))
											.add(Json.createArrayBuilder().add(-35.7243685107).add(-7.6379674094))
											.add(Json.createArrayBuilder().add(-35.7332329638).add(-7.6295748940))
											.add(Json.createArrayBuilder().add(-35.7292137652).add(-7.6259535523))
											.add(Json.createArrayBuilder().add(-35.7342574555).add(-7.6214567204))
											.add(Json.createArrayBuilder().add(-35.7336315000).add(-7.6145837142))
											.add(Json.createArrayBuilder().add(-35.7294080860).add(-7.6084125816))
											.add(Json.createArrayBuilder().add(-35.7337980025).add(-7.5974204385))
											.add(Json.createArrayBuilder().add(-35.7460627608).add(-7.5920570730))
											.add(Json.createArrayBuilder().add(-35.7449358045).add(-7.5841004391))
											.add(Json.createArrayBuilder().add(-35.7573043008).add(-7.5722635212))
											.add(Json.createArrayBuilder().add(-35.7579715121).add(-7.5716239789))
											.add(Json.createArrayBuilder().add(-35.7845408030).add(-7.5464047692))
											.add(Json.createArrayBuilder().add(-35.7904156148).add(-7.5408260905))
											.add(Json.createArrayBuilder().add(-35.7956583177).add(-7.5350297546))
											.add(Json.createArrayBuilder().add(-35.8062892936).add(-7.5308935817))
											.add(Json.createArrayBuilder().add(-35.8126789108).add(-7.5264553963))
											.add(Json.createArrayBuilder().add(-35.8296655006).add(-7.4937308458))
											.add(Json.createArrayBuilder().add(-35.8314835991).add(-7.4658849257))
											.add(Json.createArrayBuilder().add(-35.8245283087).add(-7.4599124611))
											.add(Json.createArrayBuilder().add(-35.8207135307).add(-7.4640196509))
											.add(Json.createArrayBuilder().add(-35.8137741905).add(-7.4601194128))
											.add(Json.createArrayBuilder().add(-35.8064190727).add(-7.4635150449))
											.add(Json.createArrayBuilder().add(-35.8090468018).add(-7.4658049532))
											.add(Json.createArrayBuilder().add(-35.8073914121).add(-7.4713979313))
											.add(Json.createArrayBuilder().add(-35.7958633799).add(-7.4710993706))
											.add(Json.createArrayBuilder().add(-35.7910512119).add(-7.4635376415))
											.add(Json.createArrayBuilder().add(-35.7864579605).add(-7.4660988883))
											.add(Json.createArrayBuilder().add(-35.7869310679).add(-7.4722040322))
											.add(Json.createArrayBuilder().add(-35.7863611843).add(-7.4751783607))
											.add(Json.createArrayBuilder().add(-35.7787993694).add(-7.4702390175))
											.add(Json.createArrayBuilder().add(-35.7729808547).add(-7.4736255017))
											.add(Json.createArrayBuilder().add(-35.7734193735).add(-7.4795539617))
											.add(Json.createArrayBuilder().add(-35.7704171797).add(-7.4813067054))
											.add(Json.createArrayBuilder().add(-35.7640870520).add(-7.4769569601))
											.add(Json.createArrayBuilder().add(-35.7593266181).add(-7.4775071118))
											.add(Json.createArrayBuilder().add(-35.7543570849).add(-7.4694066401))
											.add(Json.createArrayBuilder().add(-35.7467487362).add(-7.4740334080))
											.add(Json.createArrayBuilder().add(-35.7368991478).add(-7.4675016230))
											.add(Json.createArrayBuilder().add(-35.7339521471).add(-7.4743665432))
											.add(Json.createArrayBuilder().add(-35.7227470086).add(-7.4653061222))
											.add(Json.createArrayBuilder().add(-35.7218536066).add(-7.4714329762))
											.add(Json.createArrayBuilder().add(-35.7198196169).add(-7.4739891824))
											.add(Json.createArrayBuilder().add(-35.7118026112).add(-7.4700801735))
											.add(Json.createArrayBuilder().add(-35.7074552711).add(-7.4722201113))
											.add(Json.createArrayBuilder().add(-35.6992335732).add(-7.4679921393))
											.add(Json.createArrayBuilder().add(-35.6931157741).add(-7.4769441568))
											.add(Json.createArrayBuilder().add(-35.6862449840).add(-7.4758585041))
											.add(Json.createArrayBuilder().add(-35.6862512603).add(-7.4680714384))
											.add(Json.createArrayBuilder().add(-35.6792268435).add(-7.4676501389))
											.add(Json.createArrayBuilder().add(-35.6779022624).add(-7.4599796924))
											.add(Json.createArrayBuilder().add(-35.6669778643).add(-7.4657139181))
											.add(Json.createArrayBuilder().add(-35.6616180913).add(-7.4596132780))
											.add(Json.createArrayBuilder().add(-35.6423765785).add(-7.4537683145))
											.add(Json.createArrayBuilder().add(-35.6312328757).add(-7.4495896348))
											.add(Json.createArrayBuilder().add(-35.6235847678).add(-7.4518019983))
											.add(Json.createArrayBuilder().add(-35.6173865573).add(-7.4490691975))
											.add(Json.createArrayBuilder().add(-35.6046969888).add(-7.4504867761))
											.add(Json.createArrayBuilder().add(-35.6007980724).add(-7.4495653397))
											.add(Json.createArrayBuilder().add(-35.5946530776).add(-7.4539820037))
											.add(Json.createArrayBuilder().add(-35.5898241886).add(-7.4471542569))
											.add(Json.createArrayBuilder().add(-35.5836457016).add(-7.4501839801))
									
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501351")
											.add("name", "Assunção ")
											.add("description", "Assunção "))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.6715074288).add(-7.1003800515))
											.add(Json.createArrayBuilder().add(-36.6613742015).add(-7.1172234685))
											.add(Json.createArrayBuilder().add(-36.6609848734).add(-7.1266943809))
											.add(Json.createArrayBuilder().add(-36.6745928475).add(-7.1235452566))
											.add(Json.createArrayBuilder().add(-36.6937840313).add(-7.1257738752))
											.add(Json.createArrayBuilder().add(-36.6983670559).add(-7.1347658580))
											.add(Json.createArrayBuilder().add(-36.7118684222).add(-7.1414488827))
											.add(Json.createArrayBuilder().add(-36.7290760421).add(-7.1238178273))
											.add(Json.createArrayBuilder().add(-36.7276766097).add(-7.1142244150))
											.add(Json.createArrayBuilder().add(-36.7519356271).add(-7.1214062635))
											.add(Json.createArrayBuilder().add(-36.7781223700).add(-7.1121251154))
											.add(Json.createArrayBuilder().add(-36.7511642394).add(-7.0798402964))
											.add(Json.createArrayBuilder().add(-36.7509922193).add(-7.0795068676))
											.add(Json.createArrayBuilder().add(-36.7500372071).add(-7.0582551099))
											.add(Json.createArrayBuilder().add(-36.7537184727).add(-7.0425360648))
											.add(Json.createArrayBuilder().add(-36.7424816584).add(-7.0325565108))
											.add(Json.createArrayBuilder().add(-36.7418167384).add(-7.0248890440))
											.add(Json.createArrayBuilder().add(-36.7302520276).add(-7.0187920609))
											.add(Json.createArrayBuilder().add(-36.7252507716).add(-7.0034555753))
											.add(Json.createArrayBuilder().add(-36.7028246234).add(-7.0069363064))
											.add(Json.createArrayBuilder().add(-36.6861741943).add(-7.0091326776))
											.add(Json.createArrayBuilder().add(-36.6756544132).add(-7.0145498783))
											.add(Json.createArrayBuilder().add(-36.6572724269).add(-7.0495583879))
											.add(Json.createArrayBuilder().add(-36.6616160307).add(-7.0555438335))
											.add(Json.createArrayBuilder().add(-36.6575125734).add(-7.0616912786))
											.add(Json.createArrayBuilder().add(-36.6575714925).add(-7.0617608863))
											.add(Json.createArrayBuilder().add(-36.6650950793).add(-7.0706677141))
											.add(Json.createArrayBuilder().add(-36.6574263470).add(-7.0734110087))
											.add(Json.createArrayBuilder().add(-36.6690874464).add(-7.0785698303))
											.add(Json.createArrayBuilder().add(-36.6663937658).add(-7.0976377413))
											.add(Json.createArrayBuilder().add(-36.6715074288).add(-7.1003800515))
										
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501401")
											.add("name", "Baía da Traição")
											.add("description", "Baía da Traição"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-34.9926497487).add(-6.5947694052))
											.add(Json.createArrayBuilder().add(-34.9782898078).add(-6.6002111074))
											.add(Json.createArrayBuilder().add(-34.9723154227).add(-6.5963942538))
											.add(Json.createArrayBuilder().add(-34.9724356598).add(-6.6005817022))
											.add(Json.createArrayBuilder().add(-34.9651787223).add(-6.6027149216))
											.add(Json.createArrayBuilder().add(-34.9619458165).add(-6.6397814812))
											.add(Json.createArrayBuilder().add(-34.9560029860).add(-6.6621440400))
											.add(Json.createArrayBuilder().add(-34.9468645049).add(-6.6806231034))
											.add(Json.createArrayBuilder().add(-34.9308378865).add(-6.6877897500))
											.add(Json.createArrayBuilder().add(-34.9343877085).add(-6.6982732498))
											.add(Json.createArrayBuilder().add(-34.9337924227).add(-6.7101243461))
											.add(Json.createArrayBuilder().add(-34.9316271758).add(-6.7204626996))
											.add(Json.createArrayBuilder().add(-34.9438797876).add(-6.7143348025))
											.add(Json.createArrayBuilder().add(-34.9716372577).add(-6.7152135102))
											.add(Json.createArrayBuilder().add(-35.0078724106).add(-6.7043997261))
											.add(Json.createArrayBuilder().add(-35.0274180893).add(-6.7081179467))
											.add(Json.createArrayBuilder().add(-35.0312760245).add(-6.7035968766))
											.add(Json.createArrayBuilder().add(-35.0369315143).add(-6.6693002286))
											.add(Json.createArrayBuilder().add(-35.0215541111).add(-6.6238046141))
											.add(Json.createArrayBuilder().add(-35.0168712222).add(-6.6146556167))
											.add(Json.createArrayBuilder().add(-35.0054428323).add(-6.5976710654))
											.add(Json.createArrayBuilder().add(-35.0006693813).add(-6.5961823493))
											.add(Json.createArrayBuilder().add(-34.9926497487).add(-6.5947694052))
									
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501500")
											.add("name", "Bananeiras")
											.add("description", "Bananeiras"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.5601784156).add(-6.5996474439))
											.add(Json.createArrayBuilder().add(-35.5519559594).add(-6.6089453127))
											.add(Json.createArrayBuilder().add(-35.5453330133).add(-6.6097934406))
											.add(Json.createArrayBuilder().add(-35.5364694694).add(-6.6015850399))
											.add(Json.createArrayBuilder().add(-35.5286901397).add(-6.6050519917))
											.add(Json.createArrayBuilder().add(-35.5252107959).add(-6.6083520034))
											.add(Json.createArrayBuilder().add(-35.5256537177).add(-6.6442484510))
											.add(Json.createArrayBuilder().add(-35.5256524287).add(-6.6448911511))
											.add(Json.createArrayBuilder().add(-35.5256118916).add(-6.6623454359))
											.add(Json.createArrayBuilder().add(-35.5307982082).add(-6.6737297959))
											.add(Json.createArrayBuilder().add(-35.5398888106).add(-6.6872960796))
											.add(Json.createArrayBuilder().add(-35.5396607477).add(-6.6952614635))
											.add(Json.createArrayBuilder().add(-35.5400295035).add(-6.7002776899))
											.add(Json.createArrayBuilder().add(-35.5450133112).add(-6.7092428761))
											.add(Json.createArrayBuilder().add(-35.5451292545).add(-6.7209186147))
											.add(Json.createArrayBuilder().add(-35.5420687467).add(-6.7228732906))
											.add(Json.createArrayBuilder().add(-35.5373994559).add(-6.7258552583))
											.add(Json.createArrayBuilder().add(-35.5374591484).add(-6.7370380963))
											.add(Json.createArrayBuilder().add(-35.5318953730).add(-6.7449120510))
											.add(Json.createArrayBuilder().add(-35.5213592175).add(-6.7515762420))
											.add(Json.createArrayBuilder().add(-35.5212667001).add(-6.7581269633))
											.add(Json.createArrayBuilder().add(-35.5282136698).add(-6.7711257648))
											.add(Json.createArrayBuilder().add(-35.5283566063).add(-6.7710130450))
											.add(Json.createArrayBuilder().add(-35.5359778055).add(-6.7705286564))
											.add(Json.createArrayBuilder().add(-35.5667832738).add(-6.7917418285))
											.add(Json.createArrayBuilder().add(-35.5675728421).add(-6.7914846593))
											.add(Json.createArrayBuilder().add(-35.5896710835).add(-6.7842856676))
											.add(Json.createArrayBuilder().add(-35.6068165027).add(-6.7811745154))
											.add(Json.createArrayBuilder().add(-35.6129798300).add(-6.7800563782))
											.add(Json.createArrayBuilder().add(-35.6438658860).add(-6.7745727665))
											.add(Json.createArrayBuilder().add(-35.6474251034).add(-6.7622030123))
											.add(Json.createArrayBuilder().add(-35.6484932881).add(-6.7584898652))
											.add(Json.createArrayBuilder().add(-35.6518802168).add(-6.7549691540))
											.add(Json.createArrayBuilder().add(-35.6634906050).add(-6.7466339926))
											.add(Json.createArrayBuilder().add(-35.6731686501).add(-6.7316262969))
											.add(Json.createArrayBuilder().add(-35.6761651430).add(-6.7256139729))
											.add(Json.createArrayBuilder().add(-35.6726300031).add(-6.7167966390))
											.add(Json.createArrayBuilder().add(-35.6726325085).add(-6.7034606019))
											.add(Json.createArrayBuilder().add(-35.6777919773).add(-6.6874924887))
											.add(Json.createArrayBuilder().add(-35.6851900120).add(-6.6826927669))
											.add(Json.createArrayBuilder().add(-35.6885710100).add(-6.6697957724))
											.add(Json.createArrayBuilder().add(-35.6833125196).add(-6.6591701904))
											.add(Json.createArrayBuilder().add(-35.6832293516).add(-6.6589554126))
											.add(Json.createArrayBuilder().add(-35.6789327312).add(-6.6508030211))
											.add(Json.createArrayBuilder().add(-35.6701879406).add(-6.6500942502))
											.add(Json.createArrayBuilder().add(-35.6679945076).add(-6.6446084638))
											.add(Json.createArrayBuilder().add(-35.6701182022).add(-6.6373089747))
											.add(Json.createArrayBuilder().add(-35.6604831597).add(-6.6364109262))
											.add(Json.createArrayBuilder().add(-35.6506740947).add(-6.6438359467))
											.add(Json.createArrayBuilder().add(-35.6418859667).add(-6.6430808255))
											.add(Json.createArrayBuilder().add(-35.6262862770).add(-6.6559860009))
											.add(Json.createArrayBuilder().add(-35.6101056082).add(-6.6522077219))
											.add(Json.createArrayBuilder().add(-35.6021893096).add(-6.6366108373))
											.add(Json.createArrayBuilder().add(-35.5975501382).add(-6.6335333254))
											.add(Json.createArrayBuilder().add(-35.5940967173).add(-6.6271942607))
											.add(Json.createArrayBuilder().add(-35.5874892310).add(-6.6165887278))
											.add(Json.createArrayBuilder().add(-35.5747667855).add(-6.6067695927))
											.add(Json.createArrayBuilder().add(-35.5709804226).add(-6.6074383847))
											.add(Json.createArrayBuilder().add(-35.5601784156).add(-6.5996474439))
								
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501534")
											.add("name", "Baraúna")
											.add("description", "Baraúna"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.2506904250).add(-6.6841650149))
											.add(Json.createArrayBuilder().add(-36.2657045414).add(-6.6988443529))
											.add(Json.createArrayBuilder().add(-36.2660988397).add(-6.6958409105))
											.add(Json.createArrayBuilder().add(-36.2712959603).add(-6.6861998995))
											.add(Json.createArrayBuilder().add(-36.2771257744).add(-6.6568350165))
											.add(Json.createArrayBuilder().add(-36.2739341298).add(-6.6429332381))
											.add(Json.createArrayBuilder().add(-36.2725701069).add(-6.6364231859))
											.add(Json.createArrayBuilder().add(-36.2725328582).add(-6.6051440355))
											.add(Json.createArrayBuilder().add(-36.2951183496).add(-6.5710780538))
											.add(Json.createArrayBuilder().add(-36.2986922767).add(-6.5659414074))
											.add(Json.createArrayBuilder().add(-36.3007932218).add(-6.5430399903))
											.add(Json.createArrayBuilder().add(-36.2908368829).add(-6.5578303402))
											.add(Json.createArrayBuilder().add(-36.2697815972).add(-6.5721979827))
											.add(Json.createArrayBuilder().add(-36.2520156326).add(-6.5789101153))
											.add(Json.createArrayBuilder().add(-36.2338915802).add(-6.5944373927))
											.add(Json.createArrayBuilder().add(-36.2340021190).add(-6.5950240592))
											.add(Json.createArrayBuilder().add(-36.2427354161).add(-6.6414568723))
											.add(Json.createArrayBuilder().add(-36.2427904761).add(-6.6417541146))
											.add(Json.createArrayBuilder().add(-36.2506904250).add(-6.6841650149))
							
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501575")
											.add("name", "Barra de Santana")
											.add("description", "Barra de Santana"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.9578010949).add(-7.4932384769))
											.add(Json.createArrayBuilder().add(-35.9538840282).add(-7.4952177453))
											.add(Json.createArrayBuilder().add(-35.9512669258).add(-7.4928769248))
											.add(Json.createArrayBuilder().add(-35.9377261810).add(-7.5053304269))
											.add(Json.createArrayBuilder().add(-35.9190646588).add(-7.5125015950))
											.add(Json.createArrayBuilder().add(-35.9147190052).add(-7.5058409974))
											.add(Json.createArrayBuilder().add(-35.9023975856).add(-7.5077057017))
											.add(Json.createArrayBuilder().add(-35.9002714596).add(-7.5157131406))
											.add(Json.createArrayBuilder().add(-35.8908764384).add(-7.5099798687))
											.add(Json.createArrayBuilder().add(-35.8738991884).add(-7.5119068815))
											.add(Json.createArrayBuilder().add(-35.8739979242).add(-7.5121634130))
											.add(Json.createArrayBuilder().add(-35.8734719347).add(-7.5192737117))
											.add(Json.createArrayBuilder().add(-35.8825618277).add(-7.5299768794))
											.add(Json.createArrayBuilder().add(-35.8836538192).add(-7.5401944961))
											.add(Json.createArrayBuilder().add(-35.8794077454).add(-7.5451317294))
											.add(Json.createArrayBuilder().add(-35.8708497396).add(-7.5448720118))
											.add(Json.createArrayBuilder().add(-35.8638459180).add(-7.5499876010))
											.add(Json.createArrayBuilder().add(-35.8573632049).add(-7.5568702140))
											.add(Json.createArrayBuilder().add(-35.8467442376).add(-7.5564261866))
											.add(Json.createArrayBuilder().add(-35.8274391898).add(-7.5628557223))
											.add(Json.createArrayBuilder().add(-35.8285101085).add(-7.5702803325))
											.add(Json.createArrayBuilder().add(-35.8258161615).add(-7.5707482795))
											.add(Json.createArrayBuilder().add(-35.8266716292).add(-7.5734452635))
											.add(Json.createArrayBuilder().add(-35.8505967494).add(-7.5765988926))
											.add(Json.createArrayBuilder().add(-35.8644232165).add(-7.5888445183))
											.add(Json.createArrayBuilder().add(-35.8652777282).add(-7.5892604776))
											.add(Json.createArrayBuilder().add(-35.8719066482).add(-7.6040036638))
											.add(Json.createArrayBuilder().add(-35.8785931947).add(-7.6092955612))
											.add(Json.createArrayBuilder().add(-35.8669173231).add(-7.6368776820))
											.add(Json.createArrayBuilder().add(-35.8643214139).add(-7.6424907121))
											.add(Json.createArrayBuilder().add(-35.8684728536).add(-7.6484687849))
											.add(Json.createArrayBuilder().add(-35.8657248190).add(-7.6514068667))
											.add(Json.createArrayBuilder().add(-35.8655994653).add(-7.6629125090))
											.add(Json.createArrayBuilder().add(-35.8894103202).add(-7.6628561903))
											.add(Json.createArrayBuilder().add(-35.8965443949).add(-7.6692714299))
											.add(Json.createArrayBuilder().add(-35.9175940380).add(-7.6769482449))
											.add(Json.createArrayBuilder().add(-35.9222832778).add(-7.6817258970))
											.add(Json.createArrayBuilder().add(-35.9314169378).add(-7.6810822032))
											.add(Json.createArrayBuilder().add(-35.9340509738).add(-7.6684895774))
											.add(Json.createArrayBuilder().add(-35.9451953306).add(-7.6620344726))
											.add(Json.createArrayBuilder().add(-35.9525410469).add(-7.6493535397))
											.add(Json.createArrayBuilder().add(-35.9595486527).add(-7.6522763818))
											.add(Json.createArrayBuilder().add(-35.9650229064).add(-7.6483528374))
											.add(Json.createArrayBuilder().add(-35.9625502778).add(-7.6395641932))
											.add(Json.createArrayBuilder().add(-35.9723886601).add(-7.6326717450))
											.add(Json.createArrayBuilder().add(-35.9710098363).add(-7.6244536550))
											.add(Json.createArrayBuilder().add(-35.9758542485).add(-7.6131179374))
											.add(Json.createArrayBuilder().add(-35.9908626013).add(-7.6011477913))
											.add(Json.createArrayBuilder().add(-35.9901350890).add(-7.5951224431))
											.add(Json.createArrayBuilder().add(-36.0031940834).add(-7.5873931308))
											.add(Json.createArrayBuilder().add(-36.0061803829).add(-7.5899572883))
											.add(Json.createArrayBuilder().add(-36.0165736138).add(-7.5882206227))
											.add(Json.createArrayBuilder().add(-36.0185069404).add(-7.5953065329))
											.add(Json.createArrayBuilder().add(-36.0210260674).add(-7.5910291352))
											.add(Json.createArrayBuilder().add(-36.0324031559).add(-7.5869058336))
											.add(Json.createArrayBuilder().add(-36.0347504452).add(-7.5887666551))
											.add(Json.createArrayBuilder().add(-36.0506452361).add(-7.5914325074))
											.add(Json.createArrayBuilder().add(-36.0552534646).add(-7.5885975559))
											.add(Json.createArrayBuilder().add(-36.0590350864).add(-7.5972265639))
											.add(Json.createArrayBuilder().add(-36.0561677671).add(-7.6015283063))
											.add(Json.createArrayBuilder().add(-36.0629981208).add(-7.6033116302))
											.add(Json.createArrayBuilder().add(-36.0634672406).add(-7.6079591389))
											.add(Json.createArrayBuilder().add(-36.0704039976).add(-7.6018894278))
											.add(Json.createArrayBuilder().add(-36.0713257200).add(-7.6039162326))
											.add(Json.createArrayBuilder().add(-36.0869535733).add(-7.6004594194))
											.add(Json.createArrayBuilder().add(-36.0949159255).add(-7.5939521980))
											.add(Json.createArrayBuilder().add(-36.0951134517).add(-7.5812578176))
											.add(Json.createArrayBuilder().add(-36.1152428475).add(-7.5719621373))
											.add(Json.createArrayBuilder().add(-36.1175953913).add(-7.5599784772))
											.add(Json.createArrayBuilder().add(-36.1176045481).add(-7.5597629957))
											.add(Json.createArrayBuilder().add(-36.1131628041).add(-7.5554245112))
											.add(Json.createArrayBuilder().add(-36.1164166533).add(-7.5524790542))
											.add(Json.createArrayBuilder().add(-36.1105534721).add(-7.5496426679))
											.add(Json.createArrayBuilder().add(-36.1122080488).add(-7.5464059389))
											.add(Json.createArrayBuilder().add(-36.1097445732).add(-7.5450907167))
											.add(Json.createArrayBuilder().add(-36.0997521820).add(-7.5444621338))
											.add(Json.createArrayBuilder().add(-36.0924424956).add(-7.5393863682))
											.add(Json.createArrayBuilder().add(-36.0834628656).add(-7.5406661593))
											.add(Json.createArrayBuilder().add(-36.0827795329).add(-7.5341835874))
											.add(Json.createArrayBuilder().add(-36.0734332575).add(-7.5308587663))
											.add(Json.createArrayBuilder().add(-36.0669696635).add(-7.5304233270))
											.add(Json.createArrayBuilder().add(-36.0577871379).add(-7.5183490342))
											.add(Json.createArrayBuilder().add(-36.0488311278).add(-7.4824966992))
											.add(Json.createArrayBuilder().add(-36.0100260798).add(-7.4536824747))
											.add(Json.createArrayBuilder().add(-36.0094282384).add(-7.4532390794))
											.add(Json.createArrayBuilder().add(-35.9926848361).add(-7.4595736485))
											.add(Json.createArrayBuilder().add(-35.9913843215).add(-7.4671120848))
											.add(Json.createArrayBuilder().add(-35.9814252294).add(-7.4696165701))
											.add(Json.createArrayBuilder().add(-35.9726337565).add(-7.4792686477))
											.add(Json.createArrayBuilder().add(-35.9648657078).add(-7.4816218709))
											.add(Json.createArrayBuilder().add(-35.9637897852).add(-7.4882128857))
											.add(Json.createArrayBuilder().add(-35.9578010949).add(-7.4932384769))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501609")
											.add("name", "Barra de Santa Rosa")
											.add("description", "Barra de Santa Rosa"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.9742321919).add(-6.6048788992))
											.add(Json.createArrayBuilder().add(-35.9944796504).add(-6.6403239566))
											.add(Json.createArrayBuilder().add(-36.0063793997).add(-6.6504738838))
											.add(Json.createArrayBuilder().add(-36.0040702742).add(-6.6533299944))
											.add(Json.createArrayBuilder().add(-36.0081881491).add(-6.6635453906))
											.add(Json.createArrayBuilder().add(-36.0061827221).add(-6.6719756482))
											.add(Json.createArrayBuilder().add(-35.9970572019).add(-6.6796832396))
											.add(Json.createArrayBuilder().add(-35.9982253532).add(-6.6847198794))
											.add(Json.createArrayBuilder().add(-35.9937852161).add(-6.6918526189))
											.add(Json.createArrayBuilder().add(-35.9761628893).add(-6.7054401154))
											.add(Json.createArrayBuilder().add(-35.9712285507).add(-6.7052707543))
											.add(Json.createArrayBuilder().add(-35.9621856015).add(-6.6969620567))
											.add(Json.createArrayBuilder().add(-35.9486816722).add(-6.6981441211))
											.add(Json.createArrayBuilder().add(-35.9420363355).add(-6.7052021764))
											.add(Json.createArrayBuilder().add(-35.9339020108).add(-6.7179027564))
											.add(Json.createArrayBuilder().add(-35.9223933137).add(-6.7199053965))
											.add(Json.createArrayBuilder().add(-35.9221996980).add(-6.7309222455))
											.add(Json.createArrayBuilder().add(-35.8985476964).add(-6.7435650562))
											.add(Json.createArrayBuilder().add(-35.8961522524).add(-6.7499911375))
											.add(Json.createArrayBuilder().add(-35.9026167511).add(-6.7576326920))
											.add(Json.createArrayBuilder().add(-35.8993493933).add(-6.7730097078))
											.add(Json.createArrayBuilder().add(-35.9053083742).add(-6.7781330424))
											.add(Json.createArrayBuilder().add(-35.9065675143).add(-6.7842621796))
											.add(Json.createArrayBuilder().add(-35.8973826916).add(-6.7932019355))
											.add(Json.createArrayBuilder().add(-35.9164554242).add(-6.7957820304))
											.add(Json.createArrayBuilder().add(-35.9232694536).add(-6.8149830764))
											.add(Json.createArrayBuilder().add(-35.9384205860).add(-6.8284506827))
											.add(Json.createArrayBuilder().add(-35.9385682654).add(-6.8285646120))
											.add(Json.createArrayBuilder().add(-36.0018812769).add(-6.8693562096))
											.add(Json.createArrayBuilder().add(-36.0244453005).add(-6.8792803685))
											.add(Json.createArrayBuilder().add(-36.0323937775).add(-6.8815011092))
											.add(Json.createArrayBuilder().add(-36.0551690406).add(-6.8933914456))
											.add(Json.createArrayBuilder().add(-36.0713770553).add(-6.9065228024))
											.add(Json.createArrayBuilder().add(-36.0981420496).add(-6.9234768461))
											.add(Json.createArrayBuilder().add(-36.1125168163).add(-6.9307651015))
											.add(Json.createArrayBuilder().add(-36.1462167269).add(-6.9432916807))
											.add(Json.createArrayBuilder().add(-36.1473626383).add(-6.9435374504))
											.add(Json.createArrayBuilder().add(-36.1699001504).add(-6.9411073071))
											.add(Json.createArrayBuilder().add(-36.1886568907).add(-6.9214754229))
											.add(Json.createArrayBuilder().add(-36.2612488989).add(-6.8454173989))
											.add(Json.createArrayBuilder().add(-36.2611053393).add(-6.8451221193))
											.add(Json.createArrayBuilder().add(-36.2485791362).add(-6.8307682813))
											.add(Json.createArrayBuilder().add(-36.1664037054).add(-6.7366551804))
											.add(Json.createArrayBuilder().add(-36.1494392070).add(-6.7172496612))
											.add(Json.createArrayBuilder().add(-36.1493789519).add(-6.7171672853))
											.add(Json.createArrayBuilder().add(-36.1063410667).add(-6.6679235253))
											.add(Json.createArrayBuilder().add(-36.1061162124).add(-6.6676689198))
											.add(Json.createArrayBuilder().add(-36.0649704930).add(-6.6515162045))
											.add(Json.createArrayBuilder().add(-36.0453354903).add(-6.6381871118))
											.add(Json.createArrayBuilder().add(-36.0444210721).add(-6.6379570843))
											.add(Json.createArrayBuilder().add(-36.0373303218).add(-6.6382641820))
											.add(Json.createArrayBuilder().add(-36.0111515767).add(-6.6215447223))
											.add(Json.createArrayBuilder().add(-36.0004099503).add(-6.6180996426))
											.add(Json.createArrayBuilder().add(-35.9882900600).add(-6.6068196931))
											.add(Json.createArrayBuilder().add(-35.9691768797).add(-6.5890328509))
											.add(Json.createArrayBuilder().add(-35.9742321919).add(-6.6048788992))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501708")
											.add("name", "Barra de São Miguel")
											.add("description", "Barra de São Miguel"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.2200342308).add(-7.5975390886))
											.add(Json.createArrayBuilder().add(-36.2044511742).add(-7.6155615933))
											.add(Json.createArrayBuilder().add(-36.1970027008).add(-7.6395997242))
											.add(Json.createArrayBuilder().add(-36.1983009805).add(-7.6439643197))
											.add(Json.createArrayBuilder().add(-36.1976328724).add(-7.6450574126))
											.add(Json.createArrayBuilder().add(-36.1596635096).add(-7.6884443380))
											.add(Json.createArrayBuilder().add(-36.1594616505).add(-7.6936921047))
											.add(Json.createArrayBuilder().add(-36.1627360895).add(-7.7306289934))
											.add(Json.createArrayBuilder().add(-36.1581520774).add(-7.7523054831))
											.add(Json.createArrayBuilder().add(-36.1535683124).add(-7.7569736932))
											.add(Json.createArrayBuilder().add(-36.1351398682).add(-7.7616592309))
											.add(Json.createArrayBuilder().add(-36.1273599857).add(-7.7690433309))
											.add(Json.createArrayBuilder().add(-36.1264876787).add(-7.7837917795))
											.add(Json.createArrayBuilder().add(-36.1430364055).add(-7.7811515854))
											.add(Json.createArrayBuilder().add(-36.1819404481).add(-7.7834267744))
											.add(Json.createArrayBuilder().add(-36.2006238717).add(-7.7894925374))
											.add(Json.createArrayBuilder().add(-36.2061504243).add(-7.7699672825))
											.add(Json.createArrayBuilder().add(-36.2162996287).add(-7.7636937561))
											.add(Json.createArrayBuilder().add(-36.2459705328).add(-7.7849001177))
											.add(Json.createArrayBuilder().add(-36.2538610380).add(-7.7959761824))
											.add(Json.createArrayBuilder().add(-36.2540013611).add(-7.8012826280))
											.add(Json.createArrayBuilder().add(-36.2392016808).add(-7.8108006758))
											.add(Json.createArrayBuilder().add(-36.2396772071).add(-7.8172701895))
											.add(Json.createArrayBuilder().add(-36.2529582371).add(-7.8295404844))
											.add(Json.createArrayBuilder().add(-36.2631722567).add(-7.8313300399))
											.add(Json.createArrayBuilder().add(-36.2707768004).add(-7.8301553508))
											.add(Json.createArrayBuilder().add(-36.2940266375).add(-7.8114874749))
											.add(Json.createArrayBuilder().add(-36.3087959691).add(-7.8062765257))
											.add(Json.createArrayBuilder().add(-36.3365489469).add(-7.8090134947))
											.add(Json.createArrayBuilder().add(-36.3603849171).add(-7.8053075350))
											.add(Json.createArrayBuilder().add(-36.3731173955).add(-7.8122098960))
											.add(Json.createArrayBuilder().add(-36.3960932291).add(-7.8082867258))
											.add(Json.createArrayBuilder().add(-36.3988645631).add(-7.7656737251))
											.add(Json.createArrayBuilder().add(-36.4408841615).add(-7.6830316150))
											.add(Json.createArrayBuilder().add(-36.4454156137).add(-7.6741116947))
											.add(Json.createArrayBuilder().add(-36.3572506536).add(-7.6740713440))
											.add(Json.createArrayBuilder().add(-36.3530528949).add(-7.6666352878))
											.add(Json.createArrayBuilder().add(-36.3595339898).add(-7.6613454959))
											.add(Json.createArrayBuilder().add(-36.3705487667).add(-7.6381613571))
											.add(Json.createArrayBuilder().add(-36.3658554024).add(-7.6358940862))
											.add(Json.createArrayBuilder().add(-36.3615004842).add(-7.6200796368))
											.add(Json.createArrayBuilder().add(-36.3667242773).add(-7.6199440919))
											.add(Json.createArrayBuilder().add(-36.3683052245).add(-7.6131270756))
											.add(Json.createArrayBuilder().add(-36.3613420415).add(-7.6037486661))
											.add(Json.createArrayBuilder().add(-36.3526366202).add(-7.5994273129))
											.add(Json.createArrayBuilder().add(-36.3315609150).add(-7.6024466512))
											.add(Json.createArrayBuilder().add(-36.3191036258).add(-7.6103235342))
											.add(Json.createArrayBuilder().add(-36.3014655628).add(-7.5978297045))
											.add(Json.createArrayBuilder().add(-36.2957978225).add(-7.5924638825))
											.add(Json.createArrayBuilder().add(-36.2897955570).add(-7.5856119742))
											.add(Json.createArrayBuilder().add(-36.2979334690).add(-7.5846253278))
											.add(Json.createArrayBuilder().add(-36.2995083341).add(-7.5795387767))
											.add(Json.createArrayBuilder().add(-36.2902117651).add(-7.5737638700))
											.add(Json.createArrayBuilder().add(-36.2842003575).add(-7.5631578910))
											.add(Json.createArrayBuilder().add(-36.2619261184).add(-7.5523272106))
											.add(Json.createArrayBuilder().add(-36.2463705524).add(-7.5322372348))
											.add(Json.createArrayBuilder().add(-36.2369856977).add(-7.5300821439))
											.add(Json.createArrayBuilder().add(-36.2297599296).add(-7.5357143870))
											.add(Json.createArrayBuilder().add(-36.2250984144).add(-7.5417756109))
											.add(Json.createArrayBuilder().add(-36.2240059263).add(-7.5543959134))
											.add(Json.createArrayBuilder().add(-36.2267724818).add(-7.5744761749))
											.add(Json.createArrayBuilder().add(-36.2200342308).add(-7.5975390886))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501807")
											.add("name", "Bayeux")
											.add("description", "Bayeux"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-34.8914455205).add(-7.1108961033))
											.add(Json.createArrayBuilder().add(-34.8953325615).add(-7.1222936368))
											.add(Json.createArrayBuilder().add(-34.9019730163).add(-7.1204521561))
											.add(Json.createArrayBuilder().add(-34.9042792481).add(-7.1266488189))
											.add(Json.createArrayBuilder().add(-34.9128636822).add(-7.1282373818))
											.add(Json.createArrayBuilder().add(-34.9188626482).add(-7.1336801694))
											.add(Json.createArrayBuilder().add(-34.9176351683).add(-7.1430776274))
											.add(Json.createArrayBuilder().add(-34.9109168662).add(-7.1486727968))
											.add(Json.createArrayBuilder().add(-34.9110023644).add(-7.1538401263))
											.add(Json.createArrayBuilder().add(-34.9165217063).add(-7.1655185032))
											.add(Json.createArrayBuilder().add(-34.9242813628).add(-7.1705249591))
											.add(Json.createArrayBuilder().add(-34.9270277139).add(-7.1671251862))
											.add(Json.createArrayBuilder().add(-34.9341972318).add(-7.1685473900))
											.add(Json.createArrayBuilder().add(-34.9471638941).add(-7.1634976617))
											.add(Json.createArrayBuilder().add(-34.9530598960).add(-7.1688438182))
											.add(Json.createArrayBuilder().add(-34.9640871422).add(-7.1675867781))
											.add(Json.createArrayBuilder().add(-34.9734694165).add(-7.1751786857))
											.add(Json.createArrayBuilder().add(-34.9539300853).add(-7.1445416411))
											.add(Json.createArrayBuilder().add(-34.9412539987).add(-7.1246710458))
											.add(Json.createArrayBuilder().add(-34.9258345876).add(-7.1184071057))
											.add(Json.createArrayBuilder().add(-34.9212202380).add(-7.1224661822))
											.add(Json.createArrayBuilder().add(-34.9187506365).add(-7.1151887147))
											.add(Json.createArrayBuilder().add(-34.9150847303).add(-7.1157642870))
											.add(Json.createArrayBuilder().add(-34.9115280299).add(-7.1067668452))
											.add(Json.createArrayBuilder().add(-34.9142526794).add(-7.1026082423))
											.add(Json.createArrayBuilder().add(-34.9085797571).add(-7.1021981513))
											.add(Json.createArrayBuilder().add(-34.9154541281).add(-7.0936387423))
											.add(Json.createArrayBuilder().add(-34.9118371888).add(-7.0787439142))
											.add(Json.createArrayBuilder().add(-34.9025231796).add(-7.0884051136))
											.add(Json.createArrayBuilder().add(-34.8916393853).add(-7.0950088644))
											.add(Json.createArrayBuilder().add(-34.8952139184).add(-7.1056655902))
											.add(Json.createArrayBuilder().add(-34.8914455205).add(-7.1108961033))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2501906")
											.add("name", "Belém")
											.add("description", "Belém"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.4745424008).add(-6.7695626549))
											.add(Json.createArrayBuilder().add(-35.4830507836).add(-6.7742402954))
											.add(Json.createArrayBuilder().add(-35.4920685695).add(-6.7744070694))
											.add(Json.createArrayBuilder().add(-35.4983620937).add(-6.7722191847))
											.add(Json.createArrayBuilder().add(-35.5008327830).add(-6.7705121985))
											.add(Json.createArrayBuilder().add(-35.5099084619).add(-6.7581651683))
											.add(Json.createArrayBuilder().add(-35.5212667001).add(-6.7581269633))
											.add(Json.createArrayBuilder().add(-35.5213592175).add(-6.7515762420))
											.add(Json.createArrayBuilder().add(-35.5318953730).add(-6.7449120510))
											.add(Json.createArrayBuilder().add(-35.5374591484).add(-6.7370380963))
											.add(Json.createArrayBuilder().add(-35.5373994559).add(-6.7258552583))
											.add(Json.createArrayBuilder().add(-35.5420687467).add(-6.7228732906))
											.add(Json.createArrayBuilder().add(-35.5451292545).add(-6.7209186147))
											.add(Json.createArrayBuilder().add(-35.5450133112).add(-6.7092428761))
											.add(Json.createArrayBuilder().add(-35.5400295035).add(-6.7002776899))
											.add(Json.createArrayBuilder().add(-35.5396607477).add(-6.6952614635))
											.add(Json.createArrayBuilder().add(-35.5398888106).add(-6.6872960796))
											.add(Json.createArrayBuilder().add(-35.5307982082).add(-6.6737297959))
											.add(Json.createArrayBuilder().add(-35.5256118916).add(-6.6623454359))
											.add(Json.createArrayBuilder().add(-35.5256524287).add(-6.6448911511))
											.add(Json.createArrayBuilder().add(-35.5256537177).add(-6.6442484510))
											.add(Json.createArrayBuilder().add(-35.5081073415).add(-6.6476606063))
											.add(Json.createArrayBuilder().add(-35.4920396538).add(-6.6512755736))
											.add(Json.createArrayBuilder().add(-35.4230591511).add(-6.6667822662))
											.add(Json.createArrayBuilder().add(-35.4464099573).add(-6.6759551239))
											.add(Json.createArrayBuilder().add(-35.4554936800).add(-6.6889808868))
											.add(Json.createArrayBuilder().add(-35.4656610076).add(-6.7035640600))
											.add(Json.createArrayBuilder().add(-35.4960418724).add(-6.7302187223))
											.add(Json.createArrayBuilder().add(-35.4981428987).add(-6.7320623355))
											.add(Json.createArrayBuilder().add(-35.4749484724).add(-6.7403093456))
											.add(Json.createArrayBuilder().add(-35.4431405537).add(-6.7513854061))
											.add(Json.createArrayBuilder().add(-35.4590120651).add(-6.7529308245))
											.add(Json.createArrayBuilder().add(-35.4745424008).add(-6.7695626549))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502003")
											.add("name", "Belém do Brejo do Cruz")
											.add("description", "Belém do Brejo do Cruz"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.2315196221).add(-6.0271990258))
											.add(Json.createArrayBuilder().add(-37.2223466758).add(-6.0417520704))
											.add(Json.createArrayBuilder().add(-37.2040572340).add(-6.0377557637))
											.add(Json.createArrayBuilder().add(-37.1939545614).add(-6.0476370749))
											.add(Json.createArrayBuilder().add(-37.1735911858).add(-6.0476197603))
											.add(Json.createArrayBuilder().add(-37.1752326058).add(-6.0545431335))
											.add(Json.createArrayBuilder().add(-37.1702203986).add(-6.0826587938))
											.add(Json.createArrayBuilder().add(-37.1723117578).add(-6.0984326507))
											.add(Json.createArrayBuilder().add(-37.1666351899).add(-6.1099590812))
											.add(Json.createArrayBuilder().add(-37.1747551094).add(-6.1417858194))
											.add(Json.createArrayBuilder().add(-37.1660408535).add(-6.1535118602))
											.add(Json.createArrayBuilder().add(-37.1565829346).add(-6.1520912878))
											.add(Json.createArrayBuilder().add(-37.1653433753).add(-6.1699774102))
											.add(Json.createArrayBuilder().add(-37.1738808173).add(-6.1797064667))
											.add(Json.createArrayBuilder().add(-37.1926032017).add(-6.1826827197))
											.add(Json.createArrayBuilder().add(-37.1938981047).add(-6.1978498171))
											.add(Json.createArrayBuilder().add(-37.2012399702).add(-6.2053061917))
											.add(Json.createArrayBuilder().add(-37.2339307433).add(-6.2128809615))
											.add(Json.createArrayBuilder().add(-37.2389454509).add(-6.2041518700))
											.add(Json.createArrayBuilder().add(-37.2489111990).add(-6.2015680089))
											.add(Json.createArrayBuilder().add(-37.2467780628).add(-6.1928644311))
											.add(Json.createArrayBuilder().add(-37.2514492675).add(-6.1904580083))
											.add(Json.createArrayBuilder().add(-37.2664551001).add(-6.1913104185))
											.add(Json.createArrayBuilder().add(-37.2703328878).add(-6.1865154522))
											.add(Json.createArrayBuilder().add(-37.2792076936).add(-6.1870352847))
											.add(Json.createArrayBuilder().add(-37.2888647279).add(-6.1856439416))
											.add(Json.createArrayBuilder().add(-37.2886161155).add(-6.1905404428))
											.add(Json.createArrayBuilder().add(-37.2922470385).add(-6.1869438397))
											.add(Json.createArrayBuilder().add(-37.3007512062).add(-6.1887802753))
											.add(Json.createArrayBuilder().add(-37.3269494750).add(-6.1769140382))
											.add(Json.createArrayBuilder().add(-37.3326107253).add(-6.1703709333))
											.add(Json.createArrayBuilder().add(-37.3416384023).add(-6.1683187966))
											.add(Json.createArrayBuilder().add(-37.3663984244).add(-6.1736764136))
											.add(Json.createArrayBuilder().add(-37.3740444815).add(-6.1742000994))
											.add(Json.createArrayBuilder().add(-37.4009147151).add(-6.1923288138))
											.add(Json.createArrayBuilder().add(-37.4115418092).add(-6.1916873279))
											.add(Json.createArrayBuilder().add(-37.4300816750).add(-6.1999770551))
											.add(Json.createArrayBuilder().add(-37.4347453579).add(-6.1992745166))
											.add(Json.createArrayBuilder().add(-37.4373856929).add(-6.2090289325))
											.add(Json.createArrayBuilder().add(-37.4452500697).add(-6.2164773704))
											.add(Json.createArrayBuilder().add(-37.4589012914).add(-6.2211946567))
											.add(Json.createArrayBuilder().add(-37.4665047196).add(-6.2325688432))
											.add(Json.createArrayBuilder().add(-37.4842250598).add(-6.2433643417))
											.add(Json.createArrayBuilder().add(-37.4953664258).add(-6.2429588678))
											.add(Json.createArrayBuilder().add(-37.5183767190).add(-6.2414486483))
											.add(Json.createArrayBuilder().add(-37.5239025165).add(-6.2463149430))
											.add(Json.createArrayBuilder().add(-37.5322254983).add(-6.2447386461))
											.add(Json.createArrayBuilder().add(-37.5333749981).add(-6.2428388222))
											.add(Json.createArrayBuilder().add(-37.5410004365).add(-6.2437544450))
											.add(Json.createArrayBuilder().add(-37.5507263506).add(-6.2398107315))
											.add(Json.createArrayBuilder().add(-37.5760303279).add(-6.2463355611))
											.add(Json.createArrayBuilder().add(-37.5873959291).add(-6.2576406567))
											.add(Json.createArrayBuilder().add(-37.6066386668).add(-6.2635148268))
											.add(Json.createArrayBuilder().add(-37.6126800207).add(-6.2704499559))
											.add(Json.createArrayBuilder().add(-37.6152591454).add(-6.2599363524))
											.add(Json.createArrayBuilder().add(-37.6236969858).add(-6.2471575777))
											.add(Json.createArrayBuilder().add(-37.6169095809).add(-6.2299146592))
											.add(Json.createArrayBuilder().add(-37.6187059581).add(-6.2062849285))
											.add(Json.createArrayBuilder().add(-37.6159050387).add(-6.1758006785))
											.add(Json.createArrayBuilder().add(-37.5995692862).add(-6.1736141808))
											.add(Json.createArrayBuilder().add(-37.5847934518).add(-6.1624290035))
											.add(Json.createArrayBuilder().add(-37.5734271222).add(-6.1583770984))
											.add(Json.createArrayBuilder().add(-37.5733776264).add(-6.1582270118))
											.add(Json.createArrayBuilder().add(-37.5692767849).add(-6.1550420424))
											.add(Json.createArrayBuilder().add(-37.5603090735).add(-6.1641350729))
											.add(Json.createArrayBuilder().add(-37.5396515383).add(-6.1655335097))
											.add(Json.createArrayBuilder().add(-37.5360074011).add(-6.1524392782))
											.add(Json.createArrayBuilder().add(-37.5215336144).add(-6.1513943986))
											.add(Json.createArrayBuilder().add(-37.5025476811).add(-6.1517437642))
											.add(Json.createArrayBuilder().add(-37.5030532224).add(-6.1439999733))
											.add(Json.createArrayBuilder().add(-37.4890261540).add(-6.1440411781))
											.add(Json.createArrayBuilder().add(-37.4826481976).add(-6.1512842677))
											.add(Json.createArrayBuilder().add(-37.4737530898).add(-6.1483417545))
											.add(Json.createArrayBuilder().add(-37.4586047357).add(-6.1446055347))
											.add(Json.createArrayBuilder().add(-37.4535698553).add(-6.1196771954))
											.add(Json.createArrayBuilder().add(-37.4453504971).add(-6.1118058403))
											.add(Json.createArrayBuilder().add(-37.4256116497).add(-6.1086006418))
											.add(Json.createArrayBuilder().add(-37.4074674962).add(-6.1123857526))
											.add(Json.createArrayBuilder().add(-37.3918414917).add(-6.1077768263))
											.add(Json.createArrayBuilder().add(-37.3819968048).add(-6.0851575119))
											.add(Json.createArrayBuilder().add(-37.3784410195).add(-6.0847363665))
											.add(Json.createArrayBuilder().add(-37.3712226642).add(-6.0823826840))
											.add(Json.createArrayBuilder().add(-37.3540924280).add(-6.0860896540))
											.add(Json.createArrayBuilder().add(-37.3354379205).add(-6.0670633401))
											.add(Json.createArrayBuilder().add(-37.3284819060).add(-6.0643082182))
											.add(Json.createArrayBuilder().add(-37.3088583789).add(-6.0573640045))
											.add(Json.createArrayBuilder().add(-37.3002529594).add(-6.0498638721))
											.add(Json.createArrayBuilder().add(-37.2952306763).add(-6.0496991411))
											.add(Json.createArrayBuilder().add(-37.2865755033).add(-6.0575934050))
											.add(Json.createArrayBuilder().add(-37.2721363621).add(-6.0553064178))
											.add(Json.createArrayBuilder().add(-37.2632382688).add(-6.0459595636))
											.add(Json.createArrayBuilder().add(-37.2561331307).add(-6.0280751702))
											.add(Json.createArrayBuilder().add(-37.2502729262).add(-6.0255160296))
											.add(Json.createArrayBuilder().add(-37.2315196221).add(-6.0271990258))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502052")
											.add("name", "Bernardino Batista")
											.add("description", "Bernardino Batista"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.5213656477).add(-6.4716790674))
											.add(Json.createArrayBuilder().add(-38.5130096074).add(-6.4929983495))
											.add(Json.createArrayBuilder().add(-38.5367284143).add(-6.4916592180))
											.add(Json.createArrayBuilder().add(-38.5360034268).add(-6.5108627421))
											.add(Json.createArrayBuilder().add(-38.5420799093).add(-6.5116464435))
											.add(Json.createArrayBuilder().add(-38.5421954228).add(-6.5117415305))
											.add(Json.createArrayBuilder().add(-38.5709368370).add(-6.5135626709))
											.add(Json.createArrayBuilder().add(-38.5917435452).add(-6.5188656240))
											.add(Json.createArrayBuilder().add(-38.6016286821).add(-6.5256257215))
											.add(Json.createArrayBuilder().add(-38.6067315531).add(-6.5291158944))
											.add(Json.createArrayBuilder().add(-38.6101669641).add(-6.5318949622))
											.add(Json.createArrayBuilder().add(-38.6157584504).add(-6.5277463173))
											.add(Json.createArrayBuilder().add(-38.6119351786).add(-6.5127925196))
											.add(Json.createArrayBuilder().add(-38.5946195941).add(-6.5000435985))
											.add(Json.createArrayBuilder().add(-38.5700574744).add(-6.4697966402))
											.add(Json.createArrayBuilder().add(-38.5694639334).add(-6.4544775232))
											.add(Json.createArrayBuilder().add(-38.5653032544).add(-6.4511050529))
											.add(Json.createArrayBuilder().add(-38.5560523423).add(-6.4472442584))
											.add(Json.createArrayBuilder().add(-38.5550927910).add(-6.4371115164))
											.add(Json.createArrayBuilder().add(-38.5454733276).add(-6.4343790585))
											.add(Json.createArrayBuilder().add(-38.5347218075).add(-6.4445670005))
											.add(Json.createArrayBuilder().add(-38.5213656477).add(-6.4716790674))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502102")
											.add("name", "Boa Ventura")
											.add("description", "Boa Ventura"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.1179546582).add(-7.4163766324))
											.add(Json.createArrayBuilder().add(-38.0949915315).add(-7.4759974245))
											.add(Json.createArrayBuilder().add(-38.0947026328).add(-7.4767465170))
											.add(Json.createArrayBuilder().add(-38.1436890010).add(-7.4785386165))
											.add(Json.createArrayBuilder().add(-38.1536117905).add(-7.4634621248))
											.add(Json.createArrayBuilder().add(-38.1735262936).add(-7.4702191461))
											.add(Json.createArrayBuilder().add(-38.2216564797).add(-7.4865507408))
											.add(Json.createArrayBuilder().add(-38.2291847326).add(-7.4859324404))
											.add(Json.createArrayBuilder().add(-38.2571087712).add(-7.4836386167))
											.add(Json.createArrayBuilder().add(-38.2564349927).add(-7.4683659185))
											.add(Json.createArrayBuilder().add(-38.2615539378).add(-7.4610024507))
											.add(Json.createArrayBuilder().add(-38.2524030584).add(-7.4501810859))
											.add(Json.createArrayBuilder().add(-38.2463775310).add(-7.4231078519))
											.add(Json.createArrayBuilder().add(-38.2443143117).add(-7.4123013213))
											.add(Json.createArrayBuilder().add(-38.2593090795).add(-7.3883814017))
											.add(Json.createArrayBuilder().add(-38.2451516810).add(-7.3797984985))
											.add(Json.createArrayBuilder().add(-38.2457402046).add(-7.3681380792))
											.add(Json.createArrayBuilder().add(-38.2020099354).add(-7.3683146308))
											.add(Json.createArrayBuilder().add(-38.1740688474).add(-7.3687509124))
											.add(Json.createArrayBuilder().add(-38.1738034072).add(-7.3689720298))
											.add(Json.createArrayBuilder().add(-38.1414209028).add(-7.3960052660))
											.add(Json.createArrayBuilder().add(-38.1406617197).add(-7.3966391322))
											.add(Json.createArrayBuilder().add(-38.1317917479).add(-7.4062617164))
											.add(Json.createArrayBuilder().add(-38.1189570218).add(-7.4114480172))
											.add(Json.createArrayBuilder().add(-38.1179546582).add(-7.4163766324))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502151")
											.add("name", "Boa Vista")
											.add("description", "Boa Vista"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.0920630395).add(-7.1953962581))
											.add(Json.createArrayBuilder().add(-36.0939448027).add(-7.2092430229))
											.add(Json.createArrayBuilder().add(-36.1022963697).add(-7.2197440958))
											.add(Json.createArrayBuilder().add(-36.1046130175).add(-7.2305490335))
											.add(Json.createArrayBuilder().add(-36.1025418348).add(-7.2355987562))
											.add(Json.createArrayBuilder().add(-36.1059055628).add(-7.2381599650))
											.add(Json.createArrayBuilder().add(-36.1087356989).add(-7.2522856043))
											.add(Json.createArrayBuilder().add(-36.1106132417).add(-7.2564003625))
											.add(Json.createArrayBuilder().add(-36.1144426057).add(-7.2546969355))
											.add(Json.createArrayBuilder().add(-36.1139522840).add(-7.2703524615))
											.add(Json.createArrayBuilder().add(-36.1140263020).add(-7.2708032742))
											.add(Json.createArrayBuilder().add(-36.1190745659).add(-7.3017432060))
											.add(Json.createArrayBuilder().add(-36.1282809415).add(-7.3582472853))
											.add(Json.createArrayBuilder().add(-36.1473264610).add(-7.3458894724))
											.add(Json.createArrayBuilder().add(-36.1753909785).add(-7.3470105136))
											.add(Json.createArrayBuilder().add(-36.1955722425).add(-7.3613577763))
											.add(Json.createArrayBuilder().add(-36.2020318982).add(-7.3625831680))
											.add(Json.createArrayBuilder().add(-36.2113888959).add(-7.3550508513))
											.add(Json.createArrayBuilder().add(-36.2255729637).add(-7.3695767959))
											.add(Json.createArrayBuilder().add(-36.2368876374).add(-7.3680943128))
											.add(Json.createArrayBuilder().add(-36.2386214391).add(-7.3659832035))
											.add(Json.createArrayBuilder().add(-36.2334587489).add(-7.3597729157))
											.add(Json.createArrayBuilder().add(-36.2412324790).add(-7.3548670170))
											.add(Json.createArrayBuilder().add(-36.2414826751).add(-7.3548885762))
											.add(Json.createArrayBuilder().add(-36.2515530993).add(-7.3624232341))
											.add(Json.createArrayBuilder().add(-36.2723129073).add(-7.3577008539))
											.add(Json.createArrayBuilder().add(-36.2809267183).add(-7.3694250943))
											.add(Json.createArrayBuilder().add(-36.3233159114).add(-7.3717365739))
											.add(Json.createArrayBuilder().add(-36.3453889105).add(-7.3674582035))
											.add(Json.createArrayBuilder().add(-36.3305119826).add(-7.3071258087))
											.add(Json.createArrayBuilder().add(-36.3433907223).add(-7.2827421487))
											.add(Json.createArrayBuilder().add(-36.3257731506).add(-7.1883499305))
											.add(Json.createArrayBuilder().add(-36.2853630575).add(-7.1926979677))
											.add(Json.createArrayBuilder().add(-36.2221835468).add(-7.2002324500))
											.add(Json.createArrayBuilder().add(-36.2242299175).add(-7.1970202143))
											.add(Json.createArrayBuilder().add(-36.1703911136).add(-7.2014289494))
											.add(Json.createArrayBuilder().add(-36.1398035102).add(-7.1639821650))
											.add(Json.createArrayBuilder().add(-36.1093994184).add(-7.1517513245))
											.add(Json.createArrayBuilder().add(-36.0945109649).add(-7.1536040903))
											.add(Json.createArrayBuilder().add(-36.0920630395).add(-7.1953962581))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502201")
											.add("name", "Bom Jesus")
											.add("description", "Bom Jesus"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.5674355269).add(-6.7905317574))
											.add(Json.createArrayBuilder().add(-38.5735782849).add(-6.8014810239))
											.add(Json.createArrayBuilder().add(-38.5866217554).add(-6.8003679516))
											.add(Json.createArrayBuilder().add(-38.5858639445).add(-6.8040344401))
											.add(Json.createArrayBuilder().add(-38.5919494125).add(-6.8037980490))
											.add(Json.createArrayBuilder().add(-38.5979668722).add(-6.8121857655))
											.add(Json.createArrayBuilder().add(-38.6066006759).add(-6.8137685262))
											.add(Json.createArrayBuilder().add(-38.6075918587).add(-6.8200264371))
											.add(Json.createArrayBuilder().add(-38.6181515512).add(-6.8316959302))
											.add(Json.createArrayBuilder().add(-38.6151594886).add(-6.8409425464))
											.add(Json.createArrayBuilder().add(-38.6272329114).add(-6.8411291129))
											.add(Json.createArrayBuilder().add(-38.6282854163).add(-6.8472140378))
											.add(Json.createArrayBuilder().add(-38.6410407331).add(-6.8544965272))
											.add(Json.createArrayBuilder().add(-38.6485461936).add(-6.8769888248))
											.add(Json.createArrayBuilder().add(-38.6497289347).add(-6.8759823919))
											.add(Json.createArrayBuilder().add(-38.6565399208).add(-6.8658086307))
											.add(Json.createArrayBuilder().add(-38.6717195875).add(-6.8544725802))
											.add(Json.createArrayBuilder().add(-38.6719207227).add(-6.8465764733))
											.add(Json.createArrayBuilder().add(-38.6699811125).add(-6.8429688241))
											.add(Json.createArrayBuilder().add(-38.6775910983).add(-6.8341123139))
											.add(Json.createArrayBuilder().add(-38.6752158929).add(-6.8298107430))
											.add(Json.createArrayBuilder().add(-38.6614344433).add(-6.8232763524))
											.add(Json.createArrayBuilder().add(-38.6575198777).add(-6.8161594368))
											.add(Json.createArrayBuilder().add(-38.6552662573).add(-6.8137647743))
											.add(Json.createArrayBuilder().add(-38.6544150107).add(-6.8128607009))
											.add(Json.createArrayBuilder().add(-38.6480849323).add(-6.8069848196))
											.add(Json.createArrayBuilder().add(-38.6351061833).add(-6.8042195039))
											.add(Json.createArrayBuilder().add(-38.6419720473).add(-6.7912789347))
											.add(Json.createArrayBuilder().add(-38.6397791784).add(-6.7887947677))
											.add(Json.createArrayBuilder().add(-38.6291162625).add(-6.7895008853))
											.add(Json.createArrayBuilder().add(-38.6170593568).add(-6.7935774021))
											.add(Json.createArrayBuilder().add(-38.6135745027).add(-6.7820373882))
											.add(Json.createArrayBuilder().add(-38.5970533513).add(-6.7871907459))
											.add(Json.createArrayBuilder().add(-38.5674355269).add(-6.7905317574))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502300")
											.add("name", "Bom Sucesso")
											.add("description", "Bom Sucesso"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.9548584100).add(-6.4076630970))
											.add(Json.createArrayBuilder().add(-37.9450903112).add(-6.4222215081))
											.add(Json.createArrayBuilder().add(-37.9277699094).add(-6.4211943452))
											.add(Json.createArrayBuilder().add(-37.9190994716).add(-6.4112477623))
											.add(Json.createArrayBuilder().add(-37.9140384290).add(-6.4132209602))
											.add(Json.createArrayBuilder().add(-37.9120680799).add(-6.4199249487))
											.add(Json.createArrayBuilder().add(-37.8996432214).add(-6.4208898032))
											.add(Json.createArrayBuilder().add(-37.8986957724).add(-6.4209629853))
											.add(Json.createArrayBuilder().add(-37.8638977682).add(-6.4497927889))
											.add(Json.createArrayBuilder().add(-37.8871924337).add(-6.4990775878))
											.add(Json.createArrayBuilder().add(-37.8923372055).add(-6.5122006689))
											.add(Json.createArrayBuilder().add(-37.8926669995).add(-6.5130412660))
											.add(Json.createArrayBuilder().add(-37.9037275909).add(-6.5412614512))
											.add(Json.createArrayBuilder().add(-37.9160617593).add(-6.5326948648))
											.add(Json.createArrayBuilder().add(-37.9321044055).add(-6.5288693534))
											.add(Json.createArrayBuilder().add(-37.9323799879).add(-6.5288238320))
											.add(Json.createArrayBuilder().add(-37.9795230429).add(-6.5312334182))
											.add(Json.createArrayBuilder().add(-37.9975094349).add(-6.5273387605))
											.add(Json.createArrayBuilder().add(-38.0148941803).add(-6.5272447346))
											.add(Json.createArrayBuilder().add(-38.0256407592).add(-6.5276042822))
											.add(Json.createArrayBuilder().add(-38.0269955787).add(-6.5248016308))
											.add(Json.createArrayBuilder().add(-38.0191389815).add(-6.5029647363))
											.add(Json.createArrayBuilder().add(-38.0169603188).add(-6.4793288395))
											.add(Json.createArrayBuilder().add(-38.0264107741).add(-6.4743576962))
											.add(Json.createArrayBuilder().add(-38.0214674103).add(-6.4680567858))
											.add(Json.createArrayBuilder().add(-38.0125988686).add(-6.4684546360))
											.add(Json.createArrayBuilder().add(-38.0196210674).add(-6.4456062271))
											.add(Json.createArrayBuilder().add(-38.0078773533).add(-6.4317937454))
											.add(Json.createArrayBuilder().add(-38.0140452240).add(-6.4299936414))
											.add(Json.createArrayBuilder().add(-38.0133479813).add(-6.4270287272))
											.add(Json.createArrayBuilder().add(-37.9886697926).add(-6.4282373565))
											.add(Json.createArrayBuilder().add(-37.9799116444).add(-6.4266862323))
											.add(Json.createArrayBuilder().add(-37.9787367436).add(-6.4262946378))
											.add(Json.createArrayBuilder().add(-37.9683309747).add(-6.4183448003))
											.add(Json.createArrayBuilder().add(-37.9676751205).add(-6.4047240641))
											.add(Json.createArrayBuilder().add(-37.9550484348).add(-6.3978085099))
											.add(Json.createArrayBuilder().add(-37.9548584100).add(-6.4076630970))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502409")
											.add("name", "Bonito de Santa Fé")
											.add("description", "Bonito de Santa Fé"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.4440911206).add(-7.2126783104))
											.add(Json.createArrayBuilder().add(-38.4428742089).add(-7.2207603074))
											.add(Json.createArrayBuilder().add(-38.4310796112).add(-7.2264889159))
											.add(Json.createArrayBuilder().add(-38.4061838693).add(-7.2072049738))
											.add(Json.createArrayBuilder().add(-38.4056303471).add(-7.2212811282))
											.add(Json.createArrayBuilder().add(-38.4115861373).add(-7.2378117174))
											.add(Json.createArrayBuilder().add(-38.4031963294).add(-7.2482331195))
											.add(Json.createArrayBuilder().add(-38.4128035998).add(-7.2536670660))
											.add(Json.createArrayBuilder().add(-38.4161007771).add(-7.2612444646))
											.add(Json.createArrayBuilder().add(-38.4194719278).add(-7.2699041644))
											.add(Json.createArrayBuilder().add(-38.4165528796).add(-7.2809928263))
											.add(Json.createArrayBuilder().add(-38.4213804240).add(-7.2894220086))
											.add(Json.createArrayBuilder().add(-38.4216458286).add(-7.3030264101))
											.add(Json.createArrayBuilder().add(-38.4134845049).add(-7.3056957780))
											.add(Json.createArrayBuilder().add(-38.4126750996).add(-7.3211499480))
											.add(Json.createArrayBuilder().add(-38.4084685803).add(-7.3312494485))
											.add(Json.createArrayBuilder().add(-38.4148787464).add(-7.3431285972))
											.add(Json.createArrayBuilder().add(-38.4325746467).add(-7.3427530598))
											.add(Json.createArrayBuilder().add(-38.4403422129).add(-7.3579435812))
											.add(Json.createArrayBuilder().add(-38.4532811819).add(-7.3609871089))
											.add(Json.createArrayBuilder().add(-38.4628971724).add(-7.3705757827))
											.add(Json.createArrayBuilder().add(-38.4767283710).add(-7.3745820192))
											.add(Json.createArrayBuilder().add(-38.4802904420).add(-7.3816307457))
											.add(Json.createArrayBuilder().add(-38.4863116707).add(-7.3791270014))
											.add(Json.createArrayBuilder().add(-38.4868203856).add(-7.3789161784))
											.add(Json.createArrayBuilder().add(-38.4954086677).add(-7.3745424137))
											.add(Json.createArrayBuilder().add(-38.5027262977).add(-7.3750213195))
											.add(Json.createArrayBuilder().add(-38.5047716214).add(-7.3646409067))
											.add(Json.createArrayBuilder().add(-38.5159600802).add(-7.3668203574))
											.add(Json.createArrayBuilder().add(-38.5162974168).add(-7.3695157882))
											.add(Json.createArrayBuilder().add(-38.5198281324).add(-7.3645246683))
											.add(Json.createArrayBuilder().add(-38.5240408165).add(-7.3642609794))
											.add(Json.createArrayBuilder().add(-38.5280624282).add(-7.3495110402))
											.add(Json.createArrayBuilder().add(-38.5437590008).add(-7.3386650743))
											.add(Json.createArrayBuilder().add(-38.5490293910).add(-7.3345923826))
											.add(Json.createArrayBuilder().add(-38.5487298610).add(-7.3254162928))
											.add(Json.createArrayBuilder().add(-38.5500020706).add(-7.3150591868))
											.add(Json.createArrayBuilder().add(-38.5397573575).add(-7.3058127252))
											.add(Json.createArrayBuilder().add(-38.5342339256).add(-7.2933880828))
											.add(Json.createArrayBuilder().add(-38.5422781605).add(-7.2779865512))
											.add(Json.createArrayBuilder().add(-38.5417915355).add(-7.2654968890))
											.add(Json.createArrayBuilder().add(-38.5517467812).add(-7.2631555133))
											.add(Json.createArrayBuilder().add(-38.5540918801).add(-7.2514526044))
											.add(Json.createArrayBuilder().add(-38.5508033345).add(-7.2510014910))
											.add(Json.createArrayBuilder().add(-38.5453051116).add(-7.2482894342))
											.add(Json.createArrayBuilder().add(-38.5437529965).add(-7.2381392534))
											.add(Json.createArrayBuilder().add(-38.5306257206).add(-7.2305599389))
											.add(Json.createArrayBuilder().add(-38.5236651025).add(-7.2312067567))
											.add(Json.createArrayBuilder().add(-38.4992138192).add(-7.2171242060))
											.add(Json.createArrayBuilder().add(-38.4803471518).add(-7.2166313924))
											.add(Json.createArrayBuilder().add(-38.4729862054).add(-7.2152567639))
											.add(Json.createArrayBuilder().add(-38.4670309436).add(-7.2074063995))
											.add(Json.createArrayBuilder().add(-38.4698095492).add(-7.1995325745))
											.add(Json.createArrayBuilder().add(-38.4598067111).add(-7.1925043714))
											.add(Json.createArrayBuilder().add(-38.4544596478).add(-7.2110749141))
											.add(Json.createArrayBuilder().add(-38.4440911206).add(-7.2126783104))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502508")
											.add("name", "Boqueirão")
											.add("description", "Boqueirão"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.0990017393).add(-7.3916562389))
											.add(Json.createArrayBuilder().add(-36.0968587218).add(-7.4061806250))
											.add(Json.createArrayBuilder().add(-36.0958860039).add(-7.4098991399))
											.add(Json.createArrayBuilder().add(-36.1019476250).add(-7.4194548545))
											.add(Json.createArrayBuilder().add(-36.1034677606).add(-7.4298584861))
											.add(Json.createArrayBuilder().add(-36.0978901798).add(-7.4365816137))
											.add(Json.createArrayBuilder().add(-36.1046901797).add(-7.4396077121))
											.add(Json.createArrayBuilder().add(-36.1044127607).add(-7.4440695835))
											.add(Json.createArrayBuilder().add(-36.0947771363).add(-7.4498424499))
											.add(Json.createArrayBuilder().add(-36.0945832635).add(-7.4551783135))
											.add(Json.createArrayBuilder().add(-36.0674347130).add(-7.4713911523))
											.add(Json.createArrayBuilder().add(-36.0488311278).add(-7.4824966992))
											.add(Json.createArrayBuilder().add(-36.0577871379).add(-7.5183490342))
											.add(Json.createArrayBuilder().add(-36.0669696635).add(-7.5304233270))
											.add(Json.createArrayBuilder().add(-36.0734332575).add(-7.5308587663))
											.add(Json.createArrayBuilder().add(-36.0827795329).add(-7.5341835874))
											.add(Json.createArrayBuilder().add(-36.0834628656).add(-7.5406661593))
											.add(Json.createArrayBuilder().add(-36.0924424956).add(-7.5393863682))
											.add(Json.createArrayBuilder().add(-36.0997521820).add(-7.5444621338))
											.add(Json.createArrayBuilder().add(-36.1097445732).add(-7.5450907167))
											.add(Json.createArrayBuilder().add(-36.1122080488).add(-7.5464059389))
											.add(Json.createArrayBuilder().add(-36.1105534721).add(-7.5496426679))
											.add(Json.createArrayBuilder().add(-36.1164166533).add(-7.5524790542))
											.add(Json.createArrayBuilder().add(-36.1131628041).add(-7.5554245112))
											.add(Json.createArrayBuilder().add(-36.1176045481).add(-7.5597629957))
											.add(Json.createArrayBuilder().add(-36.1175953913).add(-7.5599784772))
											.add(Json.createArrayBuilder().add(-36.1152428475).add(-7.5719621373))
											.add(Json.createArrayBuilder().add(-36.0951134517).add(-7.5812578176))
											.add(Json.createArrayBuilder().add(-36.0949159255).add(-7.5939521980))
											.add(Json.createArrayBuilder().add(-36.0869535733).add(-7.6004594194))
											.add(Json.createArrayBuilder().add(-36.1033382692).add(-7.6016301433))
											.add(Json.createArrayBuilder().add(-36.1160802530).add(-7.6113116058))
											.add(Json.createArrayBuilder().add(-36.1205181455).add(-7.6086431960))
											.add(Json.createArrayBuilder().add(-36.1269433931).add(-7.6111046304))
											.add(Json.createArrayBuilder().add(-36.1365213914).add(-7.6226011057))
											.add(Json.createArrayBuilder().add(-36.1423525363).add(-7.6199139154))
											.add(Json.createArrayBuilder().add(-36.1421702894).add(-7.6235800110))
											.add(Json.createArrayBuilder().add(-36.1459261681).add(-7.6242417093))
											.add(Json.createArrayBuilder().add(-36.1527475467).add(-7.6310368924))
											.add(Json.createArrayBuilder().add(-36.1519070331).add(-7.6351806798))
											.add(Json.createArrayBuilder().add(-36.1575365392).add(-7.6382462879))
											.add(Json.createArrayBuilder().add(-36.1609735887).add(-7.6363368541))
											.add(Json.createArrayBuilder().add(-36.1693136092).add(-7.6400568841))
											.add(Json.createArrayBuilder().add(-36.1737629260).add(-7.6353492740))
											.add(Json.createArrayBuilder().add(-36.1791552397).add(-7.6400189143))
											.add(Json.createArrayBuilder().add(-36.1857740374).add(-7.6410828405))
											.add(Json.createArrayBuilder().add(-36.1894482964).add(-7.6382270574))
											.add(Json.createArrayBuilder().add(-36.1930055104).add(-7.6457639196))
											.add(Json.createArrayBuilder().add(-36.1976328724).add(-7.6450574126))
											.add(Json.createArrayBuilder().add(-36.1983009805).add(-7.6439643197))
											.add(Json.createArrayBuilder().add(-36.1970027008).add(-7.6395997242))
											.add(Json.createArrayBuilder().add(-36.2044511742).add(-7.6155615933))
											.add(Json.createArrayBuilder().add(-36.2200342308).add(-7.5975390886))
											.add(Json.createArrayBuilder().add(-36.2267724818).add(-7.5744761749))
											.add(Json.createArrayBuilder().add(-36.2240059263).add(-7.5543959134))
											.add(Json.createArrayBuilder().add(-36.2209110558).add(-7.5319428527))
											.add(Json.createArrayBuilder().add(-36.2180857531).add(-7.5114350838))
											.add(Json.createArrayBuilder().add(-36.2205932814).add(-7.4577961676))
											.add(Json.createArrayBuilder().add(-36.2229099623).add(-7.4335256660))
											.add(Json.createArrayBuilder().add(-36.2166824548).add(-7.4447605254))
											.add(Json.createArrayBuilder().add(-36.2068472956).add(-7.4424297063))
											.add(Json.createArrayBuilder().add(-36.2024007806).add(-7.4265193784))
											.add(Json.createArrayBuilder().add(-36.1937988342).add(-7.4241018182))
											.add(Json.createArrayBuilder().add(-36.1912524551).add(-7.4074476619))
											.add(Json.createArrayBuilder().add(-36.1967598110).add(-7.4052138549))
											.add(Json.createArrayBuilder().add(-36.1947307746).add(-7.3965034274))
											.add(Json.createArrayBuilder().add(-36.1887555432).add(-7.3979785877))
											.add(Json.createArrayBuilder().add(-36.1457119535).add(-7.3910885527))
											.add(Json.createArrayBuilder().add(-36.1421509061).add(-7.3557109306))
											.add(Json.createArrayBuilder().add(-36.1473264610).add(-7.3458894724))
											.add(Json.createArrayBuilder().add(-36.1282809415).add(-7.3582472853))
											.add(Json.createArrayBuilder().add(-36.1230634123).add(-7.3729918142))
											.add(Json.createArrayBuilder().add(-36.1110580947).add(-7.3849431487))
											.add(Json.createArrayBuilder().add(-36.0990017393).add(-7.3916562389))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502607")
											.add("name", "Igaracy")
											.add("description", "Igaracy"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.1236211750).add(-7.0863244389))
											.add(Json.createArrayBuilder().add(-38.1064438639).add(-7.0875245786))
											.add(Json.createArrayBuilder().add(-38.0979223255).add(-7.0864594293))
											.add(Json.createArrayBuilder().add(-38.0946079239).add(-7.0907702400))
											.add(Json.createArrayBuilder().add(-38.0912735245).add(-7.0902680948))
											.add(Json.createArrayBuilder().add(-38.0582177878).add(-7.0870471685))
											.add(Json.createArrayBuilder().add(-38.0578332568).add(-7.0947125089))
											.add(Json.createArrayBuilder().add(-38.0649595454).add(-7.1149909144))
											.add(Json.createArrayBuilder().add(-38.0632245180).add(-7.1186636186))
											.add(Json.createArrayBuilder().add(-38.0707746550).add(-7.1216963248))
											.add(Json.createArrayBuilder().add(-38.0775570466).add(-7.1394173364))
											.add(Json.createArrayBuilder().add(-38.0762541877).add(-7.1492993115))
											.add(Json.createArrayBuilder().add(-38.0670256508).add(-7.1671078265))
											.add(Json.createArrayBuilder().add(-38.0526864956).add(-7.1808557733))
											.add(Json.createArrayBuilder().add(-38.0524570234).add(-7.1915261059))
											.add(Json.createArrayBuilder().add(-38.0507817411).add(-7.1985885775))
											.add(Json.createArrayBuilder().add(-38.0558281463).add(-7.2023992339))
											.add(Json.createArrayBuilder().add(-38.0529288949).add(-7.2074313939))
											.add(Json.createArrayBuilder().add(-38.0571522757).add(-7.2135994883))
											.add(Json.createArrayBuilder().add(-38.0561775653).add(-7.2191964560))
											.add(Json.createArrayBuilder().add(-38.0640705805).add(-7.2212657069))
											.add(Json.createArrayBuilder().add(-38.0667689375).add(-7.2186586657))
											.add(Json.createArrayBuilder().add(-38.0692701017).add(-7.2210894194))
											.add(Json.createArrayBuilder().add(-38.0842984498).add(-7.2183205433))
											.add(Json.createArrayBuilder().add(-38.0915126251).add(-7.2349423394))
											.add(Json.createArrayBuilder().add(-38.1174310764).add(-7.2247856380))
											.add(Json.createArrayBuilder().add(-38.1333224672).add(-7.2232379551))
											.add(Json.createArrayBuilder().add(-38.1557760233).add(-7.2210504824))
											.add(Json.createArrayBuilder().add(-38.1576332754).add(-7.1888477593))
											.add(Json.createArrayBuilder().add(-38.1576800809).add(-7.1887542990))
											.add(Json.createArrayBuilder().add(-38.1717592648).add(-7.1605464484))
											.add(Json.createArrayBuilder().add(-38.2271360122).add(-7.1510627406))
											.add(Json.createArrayBuilder().add(-38.2313189405).add(-7.1463035203))
											.add(Json.createArrayBuilder().add(-38.2324883693).add(-7.1311331812))
											.add(Json.createArrayBuilder().add(-38.2041615937).add(-7.1198265415))
											.add(Json.createArrayBuilder().add(-38.1980996766).add(-7.1203044900))
											.add(Json.createArrayBuilder().add(-38.1876060414).add(-7.1141185101))
											.add(Json.createArrayBuilder().add(-38.1867909770).add(-7.1179338574))
											.add(Json.createArrayBuilder().add(-38.1810008959).add(-7.1185120965))
											.add(Json.createArrayBuilder().add(-38.1754316203).add(-7.1077982607))
											.add(Json.createArrayBuilder().add(-38.1605619630).add(-7.1080540878))
											.add(Json.createArrayBuilder().add(-38.1531707468).add(-7.0989576354))
											.add(Json.createArrayBuilder().add(-38.1432092027).add(-7.0878412339))
											.add(Json.createArrayBuilder().add(-38.1335411344).add(-7.0873908030))
											.add(Json.createArrayBuilder().add(-38.1297215025).add(-7.0901588646))
											.add(Json.createArrayBuilder().add(-38.1236211750).add(-7.0863244389))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502706")
											.add("name", "Borborema")
											.add("description", "Borborema"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.5282136698).add(-6.7711257648))
											.add(Json.createArrayBuilder().add(-35.5667613779).add(-6.8004518702))
											.add(Json.createArrayBuilder().add(-35.5743651812).add(-6.8060465131))
											.add(Json.createArrayBuilder().add(-35.5988365276).add(-6.8108438472))
											.add(Json.createArrayBuilder().add(-35.5997789134).add(-6.8110286356))
											.add(Json.createArrayBuilder().add(-35.6059404909).add(-6.8110047882))
											.add(Json.createArrayBuilder().add(-35.6168239573).add(-6.8094687687))
											.add(Json.createArrayBuilder().add(-35.6280893352).add(-6.8066676467))
											.add(Json.createArrayBuilder().add(-35.6364569976).add(-6.8003095789))
											.add(Json.createArrayBuilder().add(-35.6438658860).add(-6.7745727665))
											.add(Json.createArrayBuilder().add(-35.6129798300).add(-6.7800563782))
											.add(Json.createArrayBuilder().add(-35.6068165027).add(-6.7811745154))
											.add(Json.createArrayBuilder().add(-35.5896710835).add(-6.7842856676))
											.add(Json.createArrayBuilder().add(-35.5675728421).add(-6.7914846593))
											.add(Json.createArrayBuilder().add(-35.5667832738).add(-6.7917418285))
											.add(Json.createArrayBuilder().add(-35.5359778055).add(-6.7705286564))
											.add(Json.createArrayBuilder().add(-35.5283566063).add(-6.7710130450))
											.add(Json.createArrayBuilder().add(-35.5282136698).add(-6.7711257648))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502805")
											.add("name", "Brejo do Cruz")
											.add("description", "Brejo do Cruz"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.5507263506).add(-6.2398107315))
											.add(Json.createArrayBuilder().add(-37.5410004365).add(-6.2437544450))
											.add(Json.createArrayBuilder().add(-37.5333749981).add(-6.2428388222))
											.add(Json.createArrayBuilder().add(-37.5322254983).add(-6.2447386461))
											.add(Json.createArrayBuilder().add(-37.5239025165).add(-6.2463149430))
											.add(Json.createArrayBuilder().add(-37.5183767190).add(-6.2414486483))
											.add(Json.createArrayBuilder().add(-37.4953664258).add(-6.2429588678))
											.add(Json.createArrayBuilder().add(-37.4842250598).add(-6.2433643417))
											.add(Json.createArrayBuilder().add(-37.4804430548).add(-6.2587632257))
											.add(Json.createArrayBuilder().add(-37.4705836509).add(-6.2696702454))
											.add(Json.createArrayBuilder().add(-37.4479694593).add(-6.2796233592))
											.add(Json.createArrayBuilder().add(-37.4423122460).add(-6.2919988472))
											.add(Json.createArrayBuilder().add(-37.4396017839).add(-6.2877947592))
											.add(Json.createArrayBuilder().add(-37.4332898679).add(-6.2864865745))
											.add(Json.createArrayBuilder().add(-37.4165591601).add(-6.2850167320))
											.add(Json.createArrayBuilder().add(-37.4105295963).add(-6.2906685443))
											.add(Json.createArrayBuilder().add(-37.3942824203).add(-6.2863198423))
											.add(Json.createArrayBuilder().add(-37.3867655844).add(-6.2771278917))
											.add(Json.createArrayBuilder().add(-37.3835675140).add(-6.2813471984))
											.add(Json.createArrayBuilder().add(-37.3706726755).add(-6.2822816443))
											.add(Json.createArrayBuilder().add(-37.3513619182).add(-6.2980248253))
											.add(Json.createArrayBuilder().add(-37.3464426223).add(-6.2988127399))
											.add(Json.createArrayBuilder().add(-37.3438133377).add(-6.3054261905))
											.add(Json.createArrayBuilder().add(-37.3336162887).add(-6.3079419246))
											.add(Json.createArrayBuilder().add(-37.3630112997).add(-6.3217674499))
											.add(Json.createArrayBuilder().add(-37.3769867311).add(-6.3439942917))
											.add(Json.createArrayBuilder().add(-37.3775045331).add(-6.3500402197))
											.add(Json.createArrayBuilder().add(-37.3771988358).add(-6.3689335778))
											.add(Json.createArrayBuilder().add(-37.3821036817).add(-6.3730129546))
											.add(Json.createArrayBuilder().add(-37.3882066744).add(-6.3793353473))
											.add(Json.createArrayBuilder().add(-37.3884887732).add(-6.3905806622))
											.add(Json.createArrayBuilder().add(-37.4123610527).add(-6.3904760198))
											.add(Json.createArrayBuilder().add(-37.4593339057).add(-6.3946249571))
											.add(Json.createArrayBuilder().add(-37.4596932902).add(-6.3946690722))
											.add(Json.createArrayBuilder().add(-37.4778933984).add(-6.4039052263))
											.add(Json.createArrayBuilder().add(-37.4900621551).add(-6.4056488012))
											.add(Json.createArrayBuilder().add(-37.5100840681).add(-6.4117396344))
											.add(Json.createArrayBuilder().add(-37.5241564177).add(-6.4068046658))
											.add(Json.createArrayBuilder().add(-37.5405166142).add(-6.4129023198))
											.add(Json.createArrayBuilder().add(-37.5500221201).add(-6.4151987058))
											.add(Json.createArrayBuilder().add(-37.5615318030).add(-6.4110139732))
											.add(Json.createArrayBuilder().add(-37.5718131176).add(-6.4144170265))
											.add(Json.createArrayBuilder().add(-37.5769324749).add(-6.4205035582))
											.add(Json.createArrayBuilder().add(-37.5773742673).add(-6.4117216008))
											.add(Json.createArrayBuilder().add(-37.5841670116).add(-6.4050905576))
											.add(Json.createArrayBuilder().add(-37.5996585930).add(-6.3878188031))
											.add(Json.createArrayBuilder().add(-37.6035990237).add(-6.3697560534))
											.add(Json.createArrayBuilder().add(-37.6055809624).add(-6.3576330851))
											.add(Json.createArrayBuilder().add(-37.6019006359).add(-6.3427480759))
											.add(Json.createArrayBuilder().add(-37.6063565999).add(-6.3347554607))
											.add(Json.createArrayBuilder().add(-37.6060223852).add(-6.3257575094))
											.add(Json.createArrayBuilder().add(-37.6060265183).add(-6.3256298461))
											.add(Json.createArrayBuilder().add(-37.6055542119).add(-6.3126107046))
											.add(Json.createArrayBuilder().add(-37.6050792459).add(-6.2879151686))
											.add(Json.createArrayBuilder().add(-37.6055824103).add(-6.2837133666))
											.add(Json.createArrayBuilder().add(-37.6126046321).add(-6.2791644118))
											.add(Json.createArrayBuilder().add(-37.6126800207).add(-6.2704499559))
											.add(Json.createArrayBuilder().add(-37.6066386668).add(-6.2635148268))
											.add(Json.createArrayBuilder().add(-37.5873959291).add(-6.2576406567))
											.add(Json.createArrayBuilder().add(-37.5760303279).add(-6.2463355611))
											.add(Json.createArrayBuilder().add(-37.5507263506).add(-6.2398107315))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2502904")
											.add("name", "Brejo dos Santos")
											.add("description", "Brejo dos Santos"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.7949584660).add(-6.3664326716))
											.add(Json.createArrayBuilder().add(-37.8060660971).add(-6.4063626744))
											.add(Json.createArrayBuilder().add(-37.8179748596).add(-6.4479435030))
											.add(Json.createArrayBuilder().add(-37.8196051883).add(-6.4473997870))
											.add(Json.createArrayBuilder().add(-37.8354493880).add(-6.4398818922))
											.add(Json.createArrayBuilder().add(-37.8516230965).add(-6.4442916891))
											.add(Json.createArrayBuilder().add(-37.8638977682).add(-6.4497927889))
											.add(Json.createArrayBuilder().add(-37.8986957724).add(-6.4209629853))
											.add(Json.createArrayBuilder().add(-37.8996432214).add(-6.4208898032))
											.add(Json.createArrayBuilder().add(-37.9120680799).add(-6.4199249487))
											.add(Json.createArrayBuilder().add(-37.9140384290).add(-6.4132209602))
											.add(Json.createArrayBuilder().add(-37.9190994716).add(-6.4112477623))
											.add(Json.createArrayBuilder().add(-37.9011853352).add(-6.3992803143))
											.add(Json.createArrayBuilder().add(-37.8899096878).add(-6.3997366825))
											.add(Json.createArrayBuilder().add(-37.8859029298).add(-6.3966022095))
											.add(Json.createArrayBuilder().add(-37.8839154043).add(-6.3912777285))
											.add(Json.createArrayBuilder().add(-37.8881645276).add(-6.3868105971))
											.add(Json.createArrayBuilder().add(-37.8878780680).add(-6.3639713496))
											.add(Json.createArrayBuilder().add(-37.8594811397).add(-6.3744790895))
											.add(Json.createArrayBuilder().add(-37.8538959222).add(-6.3659182997))
											.add(Json.createArrayBuilder().add(-37.8402976982).add(-6.3609419025))
											.add(Json.createArrayBuilder().add(-37.8437705361).add(-6.3539587617))
											.add(Json.createArrayBuilder().add(-37.8339138709).add(-6.3419873735))
											.add(Json.createArrayBuilder().add(-37.8428490989).add(-6.3326901981))
											.add(Json.createArrayBuilder().add(-37.8102677784).add(-6.3473501867))
											.add(Json.createArrayBuilder().add(-37.7954289442).add(-6.3659474408))
											.add(Json.createArrayBuilder().add(-37.7949584660).add(-6.3664326716))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503001")
											.add("name", "Caaporã")
											.add("description", "Caaporã"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-34.9063928093).add(-7.4468174471))
											.add(Json.createArrayBuilder().add(-34.8855577376).add(-7.4594136854))
											.add(Json.createArrayBuilder().add(-34.8762395304).add(-7.4559934265))
											.add(Json.createArrayBuilder().add(-34.8602835344).add(-7.4542318085))
											.add(Json.createArrayBuilder().add(-34.8561512356).add(-7.4390858656))
											.add(Json.createArrayBuilder().add(-34.8491591007).add(-7.4384676405))
											.add(Json.createArrayBuilder().add(-34.8545945146).add(-7.4632405314))
											.add(Json.createArrayBuilder().add(-34.8550646444).add(-7.5072016088))
											.add(Json.createArrayBuilder().add(-34.8549685401).add(-7.5077405474))
											.add(Json.createArrayBuilder().add(-34.8504336201).add(-7.5332572368))
											.add(Json.createArrayBuilder().add(-34.8535213984).add(-7.5392372091))
											.add(Json.createArrayBuilder().add(-34.8576981847).add(-7.5375406971))
											.add(Json.createArrayBuilder().add(-34.8703910340).add(-7.5487486459))
											.add(Json.createArrayBuilder().add(-34.8732688945).add(-7.5428379329))
											.add(Json.createArrayBuilder().add(-34.8884138391).add(-7.5354938660))
											.add(Json.createArrayBuilder().add(-34.8952169827).add(-7.5446647708))
											.add(Json.createArrayBuilder().add(-34.9017170961).add(-7.5431530684))
											.add(Json.createArrayBuilder().add(-34.8995743064).add(-7.5370213143))
											.add(Json.createArrayBuilder().add(-34.9101654030).add(-7.5377272335))
											.add(Json.createArrayBuilder().add(-34.9106961335).add(-7.5430324156))
											.add(Json.createArrayBuilder().add(-34.9169866828).add(-7.5413597813))
											.add(Json.createArrayBuilder().add(-34.9241220997).add(-7.5322006164))
											.add(Json.createArrayBuilder().add(-34.9323565927).add(-7.5281106914))
											.add(Json.createArrayBuilder().add(-34.9502915470).add(-7.5372122562))
											.add(Json.createArrayBuilder().add(-34.9604610929).add(-7.5383555053))
											.add(Json.createArrayBuilder().add(-34.9691149930).add(-7.5206550593))
											.add(Json.createArrayBuilder().add(-34.9787395768).add(-7.5092880236))
											.add(Json.createArrayBuilder().add(-34.9838978877).add(-7.5074778468))
											.add(Json.createArrayBuilder().add(-34.9848306797).add(-7.5003779059))
											.add(Json.createArrayBuilder().add(-34.9848121312).add(-7.4996012688))
											.add(Json.createArrayBuilder().add(-34.9846573701).add(-7.4989898405))
											.add(Json.createArrayBuilder().add(-34.9771398376).add(-7.4692141473))
											.add(Json.createArrayBuilder().add(-34.9812600643).add(-7.4563647556))
											.add(Json.createArrayBuilder().add(-34.9782710809).add(-7.4411424113))
											.add(Json.createArrayBuilder().add(-34.9759760175).add(-7.4362524341))
											.add(Json.createArrayBuilder().add(-34.9689392298).add(-7.4337493446))
											.add(Json.createArrayBuilder().add(-34.9542783206).add(-7.4048858196))
											.add(Json.createArrayBuilder().add(-34.9423707865).add(-7.4162881863))
											.add(Json.createArrayBuilder().add(-34.9413010400).add(-7.4220347492))
											.add(Json.createArrayBuilder().add(-34.9240010272).add(-7.4311473973))
											.add(Json.createArrayBuilder().add(-34.9197225652).add(-7.4393207693))
											.add(Json.createArrayBuilder().add(-34.9099695187).add(-7.4449270147))
											.add(Json.createArrayBuilder().add(-34.9063928093).add(-7.4468174471))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503100")
											.add("name", "Cabaceiras")
											.add("description", "Cabaceiras"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-36.3453889105).add(-7.3674582035))
											.add(Json.createArrayBuilder().add(-36.3233159114).add(-7.3717365739))
											.add(Json.createArrayBuilder().add(-36.2809267183).add(-7.3694250943))
											.add(Json.createArrayBuilder().add(-36.2723129073).add(-7.3577008539))
											.add(Json.createArrayBuilder().add(-36.2515530993).add(-7.3624232341))
											.add(Json.createArrayBuilder().add(-36.2414826751).add(-7.3548885762))
											.add(Json.createArrayBuilder().add(-36.2412324790).add(-7.3548670170))
											.add(Json.createArrayBuilder().add(-36.2334587489).add(-7.3597729157))
											.add(Json.createArrayBuilder().add(-36.2386214391).add(-7.3659832035))
											.add(Json.createArrayBuilder().add(-36.2368876374).add(-7.3680943128))
											.add(Json.createArrayBuilder().add(-36.2255729637).add(-7.3695767959))
											.add(Json.createArrayBuilder().add(-36.2113888959).add(-7.3550508513))
											.add(Json.createArrayBuilder().add(-36.2020318982).add(-7.3625831680))
											.add(Json.createArrayBuilder().add(-36.1955722425).add(-7.3613577763))
											.add(Json.createArrayBuilder().add(-36.1753909785).add(-7.3470105136))
											.add(Json.createArrayBuilder().add(-36.1473264610).add(-7.3458894724))
											.add(Json.createArrayBuilder().add(-36.1421509061).add(-7.3557109306))
											.add(Json.createArrayBuilder().add(-36.1457119535).add(-7.3910885527))
											.add(Json.createArrayBuilder().add(-36.1887555432).add(-7.3979785877))
											.add(Json.createArrayBuilder().add(-36.1947307746).add(-7.3965034274))
											.add(Json.createArrayBuilder().add(-36.1967598110).add(-7.4052138549))
											.add(Json.createArrayBuilder().add(-36.1912524551).add(-7.4074476619))
											.add(Json.createArrayBuilder().add(-36.1937988342).add(-7.4241018182))
											.add(Json.createArrayBuilder().add(-36.2024007806).add(-7.4265193784))
											.add(Json.createArrayBuilder().add(-36.2068472956).add(-7.4424297063))
											.add(Json.createArrayBuilder().add(-36.2166824548).add(-7.4447605254))
											.add(Json.createArrayBuilder().add(-36.2229099623).add(-7.4335256660))
											.add(Json.createArrayBuilder().add(-36.2205932814).add(-7.4577961676))
											.add(Json.createArrayBuilder().add(-36.2180857531).add(-7.5114350838))
											.add(Json.createArrayBuilder().add(-36.2209110558).add(-7.5319428527))
											.add(Json.createArrayBuilder().add(-36.2240059263).add(-7.5543959134))
											.add(Json.createArrayBuilder().add(-36.2250984144).add(-7.5417756109))
											.add(Json.createArrayBuilder().add(-36.2297599296).add(-7.5357143870))
											.add(Json.createArrayBuilder().add(-36.2369856977).add(-7.5300821439))
											.add(Json.createArrayBuilder().add(-36.2463705524).add(-7.5322372348))
											.add(Json.createArrayBuilder().add(-36.2619261184).add(-7.5523272106))
											.add(Json.createArrayBuilder().add(-36.2842003575).add(-7.5631578910))
											.add(Json.createArrayBuilder().add(-36.2902117651).add(-7.5737638700))
											.add(Json.createArrayBuilder().add(-36.2995083341).add(-7.5795387767))
											.add(Json.createArrayBuilder().add(-36.2979334690).add(-7.5846253278))
											.add(Json.createArrayBuilder().add(-36.2897955570).add(-7.5856119742))
											.add(Json.createArrayBuilder().add(-36.2957978225).add(-7.5924638825))
											.add(Json.createArrayBuilder().add(-36.3014655628).add(-7.5978297045))
											.add(Json.createArrayBuilder().add(-36.3151115653).add(-7.5921617581))
											.add(Json.createArrayBuilder().add(-36.3332499534).add(-7.5650076976))
											.add(Json.createArrayBuilder().add(-36.3282774454).add(-7.5490742176))
											.add(Json.createArrayBuilder().add(-36.3479469667).add(-7.5484508991))
											.add(Json.createArrayBuilder().add(-36.3526640905).add(-7.5418666275))
											.add(Json.createArrayBuilder().add(-36.3583544129).add(-7.5403061885))
											.add(Json.createArrayBuilder().add(-36.3667768183).add(-7.5261834548))
											.add(Json.createArrayBuilder().add(-36.3706663431).add(-7.5255463373))
											.add(Json.createArrayBuilder().add(-36.3718577520).add(-7.5136774462))
											.add(Json.createArrayBuilder().add(-36.3818887903).add(-7.5109864403))
											.add(Json.createArrayBuilder().add(-36.3849134372).add(-7.5061038586))
											.add(Json.createArrayBuilder().add(-36.3865516240).add(-7.5094526082))
											.add(Json.createArrayBuilder().add(-36.3903886709).add(-7.5054862426))
											.add(Json.createArrayBuilder().add(-36.3943378433).add(-7.5069221758))
											.add(Json.createArrayBuilder().add(-36.3947485257).add(-7.5009129146))
											.add(Json.createArrayBuilder().add(-36.4008647991).add(-7.5016933277))
											.add(Json.createArrayBuilder().add(-36.4086688908).add(-7.4941239796))
											.add(Json.createArrayBuilder().add(-36.4208643993).add(-7.4943640862))
											.add(Json.createArrayBuilder().add(-36.4270706360).add(-7.4883165419))
											.add(Json.createArrayBuilder().add(-36.3813651124).add(-7.4025792855))
											.add(Json.createArrayBuilder().add(-36.3305119826).add(-7.3071258087))
											.add(Json.createArrayBuilder().add(-36.3453889105).add(-7.3674582035))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503209")
											.add("name", "Cabedelo")
											.add("description", "Cabedelo"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-34.8636659744).add(-6.9804063003))
											.add(Json.createArrayBuilder().add(-34.8579490294).add(-6.9839079887))
											.add(Json.createArrayBuilder().add(-34.8473924017).add(-6.9816410140))
											.add(Json.createArrayBuilder().add(-34.8493083260).add(-6.9995593520))
											.add(Json.createArrayBuilder().add(-34.8588355978).add(-7.0152153981))
											.add(Json.createArrayBuilder().add(-34.8652758008).add(-7.0042999431))
											.add(Json.createArrayBuilder().add(-34.8671629407).add(-6.9872818777))
											.add(Json.createArrayBuilder().add(-34.8636659744).add(-6.9804063003))
											).add(Json.createArrayBuilder()/*por algum motivo nesse mapa ele fecha o array e abre de novo por isso foi feito isso aqui*/
											.add(Json.createArrayBuilder().add(-34.8254684241).add(-7.0065962406))
											.add(Json.createArrayBuilder().add(-34.8298639975).add(-7.0304735810))
											.add(Json.createArrayBuilder().add(-34.8405292664).add(-7.0422910209))
											.add(Json.createArrayBuilder().add(-34.8433577961).add(-7.0554186969))
											.add(Json.createArrayBuilder().add(-34.8496962444).add(-7.0616418702))
											.add(Json.createArrayBuilder().add(-34.8450803384).add(-7.0994328214))
											.add(Json.createArrayBuilder().add(-34.8571858579).add(-7.0948512135))
											.add(Json.createArrayBuilder().add(-34.8657768870).add(-7.0804829976))
											.add(Json.createArrayBuilder().add(-34.8596424060).add(-7.0746003284))
											.add(Json.createArrayBuilder().add(-34.8586608293).add(-7.0672507596))
											.add(Json.createArrayBuilder().add(-34.8573584628).add(-7.0633797877))
											.add(Json.createArrayBuilder().add(-34.8652184889).add(-7.0577169754))
											.add(Json.createArrayBuilder().add(-34.8592774996).add(-7.0267111996))
											.add(Json.createArrayBuilder().add(-34.8548075126).add(-7.0271109610))
											.add(Json.createArrayBuilder().add(-34.8483085086).add(-7.0110030335))
											.add(Json.createArrayBuilder().add(-34.8348314232).add(-6.9983413183))
											.add(Json.createArrayBuilder().add(-34.8351922897).add(-6.9788726833))
											.add(Json.createArrayBuilder().add(-34.8415071902).add(-6.9661464390))
											.add(Json.createArrayBuilder().add(-34.8298934377).add(-6.9662120489))
											.add(Json.createArrayBuilder().add(-34.8254684241).add(-7.0065962406))

											)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503308")
											.add("name", "Cachoeira dos Índios")
											.add("description", "Cachoeira dos Índios"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.6565399208).add(-6.8658086307))
											.add(Json.createArrayBuilder().add(-38.6497289347).add(-6.8759823919))
											.add(Json.createArrayBuilder().add(-38.6485461936).add(-6.8769888248))
											.add(Json.createArrayBuilder().add(-38.6536815657).add(-6.8882757951))
											.add(Json.createArrayBuilder().add(-38.6485755103).add(-6.8915296512))
											.add(Json.createArrayBuilder().add(-38.6524358142).add(-6.9003129386))
											.add(Json.createArrayBuilder().add(-38.6454133061).add(-6.9252415270))
											.add(Json.createArrayBuilder().add(-38.6519540523).add(-6.9369762256))
											.add(Json.createArrayBuilder().add(-38.6487874769).add(-6.9422857612))
											.add(Json.createArrayBuilder().add(-38.6554978333).add(-6.9518947957))
											.add(Json.createArrayBuilder().add(-38.6605798312).add(-6.9521944371))
											.add(Json.createArrayBuilder().add(-38.6609884534).add(-6.9562740427))
											.add(Json.createArrayBuilder().add(-38.6577130534).add(-6.9627709606))
											.add(Json.createArrayBuilder().add(-38.6627099198).add(-6.9667488701))
											.add(Json.createArrayBuilder().add(-38.6583911345).add(-6.9697918023))
											.add(Json.createArrayBuilder().add(-38.6596073134).add(-6.9745161748))
											.add(Json.createArrayBuilder().add(-38.6571188365).add(-6.9758297821))
											.add(Json.createArrayBuilder().add(-38.6588175104).add(-6.9820737408))
											.add(Json.createArrayBuilder().add(-38.6648283614).add(-6.9860245555))
											.add(Json.createArrayBuilder().add(-38.6620143372).add(-6.9901698741))
											.add(Json.createArrayBuilder().add(-38.6720460515).add(-6.9965993688))
											.add(Json.createArrayBuilder().add(-38.6680699766).add(-7.0008558134))
											.add(Json.createArrayBuilder().add(-38.6700351697).add(-7.0121900605))
											.add(Json.createArrayBuilder().add(-38.6621799067).add(-7.0180772258))
											.add(Json.createArrayBuilder().add(-38.6735110796).add(-7.0387188905))
											.add(Json.createArrayBuilder().add(-38.6726617473).add(-7.0458276162))
											.add(Json.createArrayBuilder().add(-38.6894473188).add(-7.0398266207))
											.add(Json.createArrayBuilder().add(-38.6910870418).add(-7.0287368839))
											.add(Json.createArrayBuilder().add(-38.7131627703).add(-7.0176805715))
											.add(Json.createArrayBuilder().add(-38.7167596240).add(-7.0165388628))
											.add(Json.createArrayBuilder().add(-38.7302292797).add(-7.0116253432))
											.add(Json.createArrayBuilder().add(-38.7506372952).add(-6.9969088792))
											.add(Json.createArrayBuilder().add(-38.7583310335).add(-6.9980586714))
											.add(Json.createArrayBuilder().add(-38.7646443757).add(-6.9934926227))
											.add(Json.createArrayBuilder().add(-38.7606102204).add(-6.9896518288))
											.add(Json.createArrayBuilder().add(-38.7515337414).add(-6.9881803088))
											.add(Json.createArrayBuilder().add(-38.7425237967).add(-6.9746011517))
											.add(Json.createArrayBuilder().add(-38.7477222617).add(-6.9663024057))
											.add(Json.createArrayBuilder().add(-38.7466110266).add(-6.9601778858))
											.add(Json.createArrayBuilder().add(-38.7569468511).add(-6.9577745855))
											.add(Json.createArrayBuilder().add(-38.7649949009).add(-6.9475355728))
											.add(Json.createArrayBuilder().add(-38.7553627592).add(-6.9397268417))
											.add(Json.createArrayBuilder().add(-38.7571367297).add(-6.9342153292))
											.add(Json.createArrayBuilder().add(-38.7620547447).add(-6.9261423612))
											.add(Json.createArrayBuilder().add(-38.7584125172).add(-6.9248767150))
											.add(Json.createArrayBuilder().add(-38.7585725975).add(-6.9162245649))
											.add(Json.createArrayBuilder().add(-38.7648581110).add(-6.9105122381))
											.add(Json.createArrayBuilder().add(-38.7559246557).add(-6.9031899410))
											.add(Json.createArrayBuilder().add(-38.7299342711).add(-6.8964118247))
											.add(Json.createArrayBuilder().add(-38.7311780883).add(-6.8888700272))
											.add(Json.createArrayBuilder().add(-38.7283035031).add(-6.8869740835))
											.add(Json.createArrayBuilder().add(-38.7136586546).add(-6.8857450548))
											.add(Json.createArrayBuilder().add(-38.7138068535).add(-6.8763821357))
											.add(Json.createArrayBuilder().add(-38.7087766761).add(-6.8740240756))
											.add(Json.createArrayBuilder().add(-38.7000558722).add(-6.8762007334))
											.add(Json.createArrayBuilder().add(-38.6863371702).add(-6.8653902219))
											.add(Json.createArrayBuilder().add(-38.6781652584).add(-6.8636641559))
											.add(Json.createArrayBuilder().add(-38.6750629898).add(-6.8614279073))
											.add(Json.createArrayBuilder().add(-38.6768472843).add(-6.8539264398))
											.add(Json.createArrayBuilder().add(-38.6719207227).add(-6.8465764733))
											.add(Json.createArrayBuilder().add(-38.6717195875).add(-6.8544725802))
											.add(Json.createArrayBuilder().add(-38.6565399208).add(-6.8658086307))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503407")
											.add("name", "Cacimba de Areia")
											.add("description", "Cacimba de Areia"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.1893625856).add(-7.0588857813))
											.add(Json.createArrayBuilder().add(-37.1767711067).add(-7.0663450208))
											.add(Json.createArrayBuilder().add(-37.1701184620).add(-7.0650074875))
											.add(Json.createArrayBuilder().add(-37.1413722570).add(-7.0770025103))
											.add(Json.createArrayBuilder().add(-37.1301986279).add(-7.0858734393))
											.add(Json.createArrayBuilder().add(-37.0960821826).add(-7.0994204034))
											.add(Json.createArrayBuilder().add(-37.0866377335).add(-7.1087284957))
											.add(Json.createArrayBuilder().add(-37.0974161526).add(-7.1169122410))
											.add(Json.createArrayBuilder().add(-37.0951479697).add(-7.1283735629))
											.add(Json.createArrayBuilder().add(-37.0885044055).add(-7.1687008654))
											.add(Json.createArrayBuilder().add(-37.0870482125).add(-7.1815613054))
											.add(Json.createArrayBuilder().add(-37.0902582818).add(-7.1867733133))
											.add(Json.createArrayBuilder().add(-37.0987089546).add(-7.1865707344))
											.add(Json.createArrayBuilder().add(-37.1055682898).add(-7.1786043878))
											.add(Json.createArrayBuilder().add(-37.1149909589).add(-7.1784953396))
											.add(Json.createArrayBuilder().add(-37.1325473568).add(-7.1874179529))
											.add(Json.createArrayBuilder().add(-37.1338511072).add(-7.1887063299))
											.add(Json.createArrayBuilder().add(-37.1480663669).add(-7.1940987014))
											.add(Json.createArrayBuilder().add(-37.1602164176).add(-7.1914808792))
											.add(Json.createArrayBuilder().add(-37.1718797016).add(-7.1987149639))
											.add(Json.createArrayBuilder().add(-37.1690092679).add(-7.2073621775))
											.add(Json.createArrayBuilder().add(-37.1662179340).add(-7.2111978416))
											.add(Json.createArrayBuilder().add(-37.1702231133).add(-7.2177172295))
											.add(Json.createArrayBuilder().add(-37.1738844013).add(-7.2236753901))
											.add(Json.createArrayBuilder().add(-37.1711812831).add(-7.2271114638))
											.add(Json.createArrayBuilder().add(-37.1759725482).add(-7.2302549040))
											.add(Json.createArrayBuilder().add(-37.2101360107).add(-7.2044162012))
											.add(Json.createArrayBuilder().add(-37.2469335152).add(-7.1973533830))
											.add(Json.createArrayBuilder().add(-37.2468165897).add(-7.1930315946))
											.add(Json.createArrayBuilder().add(-37.2446338362).add(-7.1133037105))
											.add(Json.createArrayBuilder().add(-37.2445471688).add(-7.1101619485))
											.add(Json.createArrayBuilder().add(-37.2169793897).add(-7.0846708535))
											.add(Json.createArrayBuilder().add(-37.2167569736).add(-7.0844652707))
											.add(Json.createArrayBuilder().add(-37.2133437048).add(-7.0813094723))
											.add(Json.createArrayBuilder().add(-37.1893625856).add(-7.0588857813))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503506")
											.add("name", "Cacimba de Dentro")
											.add("description", "Cacimba de Dentro"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.7768839051).add(-6.5956397380))
											.add(Json.createArrayBuilder().add(-35.7765828074).add(-6.5958015695))
											.add(Json.createArrayBuilder().add(-35.7553527120).add(-6.5920981519))
											.add(Json.createArrayBuilder().add(-35.7491485731).add(-6.5975158235))
											.add(Json.createArrayBuilder().add(-35.7402987005).add(-6.5970212271))
											.add(Json.createArrayBuilder().add(-35.7366619600).add(-6.6013468271))
											.add(Json.createArrayBuilder().add(-35.7345980285).add(-6.6135337173))
											.add(Json.createArrayBuilder().add(-35.7389829623).add(-6.6150884953))
											.add(Json.createArrayBuilder().add(-35.7428409004).add(-6.6124091786))
											.add(Json.createArrayBuilder().add(-35.7538129209).add(-6.6254213977))
											.add(Json.createArrayBuilder().add(-35.7422800781).add(-6.6767402686))
											.add(Json.createArrayBuilder().add(-35.7444479043).add(-6.6768744625))
											.add(Json.createArrayBuilder().add(-35.7445436087).add(-6.6768804230))
											.add(Json.createArrayBuilder().add(-35.7488870622).add(-6.6854689480))
											.add(Json.createArrayBuilder().add(-35.7599058694).add(-6.6905695228))
											.add(Json.createArrayBuilder().add(-35.7799356778).add(-6.6906615142))
											.add(Json.createArrayBuilder().add(-35.7803819497).add(-6.6908719816))
											.add(Json.createArrayBuilder().add(-35.8039983878).add(-6.6811663456))
											.add(Json.createArrayBuilder().add(-35.8286444462).add(-6.6761756123))
											.add(Json.createArrayBuilder().add(-35.8332908951).add(-6.6669061565))
											.add(Json.createArrayBuilder().add(-35.8399772679).add(-6.6699442185))
											.add(Json.createArrayBuilder().add(-35.8474741381).add(-6.6669276495))
											.add(Json.createArrayBuilder().add(-35.8514955124).add(-6.6706040947))
											.add(Json.createArrayBuilder().add(-35.8490922210).add(-6.6827854607))
											.add(Json.createArrayBuilder().add(-35.8667267981).add(-6.6791938818))
											.add(Json.createArrayBuilder().add(-35.8713122626).add(-6.6324134641))
											.add(Json.createArrayBuilder().add(-35.8719375283).add(-6.6260151975))
											.add(Json.createArrayBuilder().add(-35.8752057011).add(-6.5925802230))
											.add(Json.createArrayBuilder().add(-35.8766194993).add(-6.5780891165))
											.add(Json.createArrayBuilder().add(-35.8678627976).add(-6.5453818687))
											.add(Json.createArrayBuilder().add(-35.8587410615).add(-6.5466670052))
											.add(Json.createArrayBuilder().add(-35.8308707043).add(-6.5637169687))
											.add(Json.createArrayBuilder().add(-35.8209402367).add(-6.5733002377))
											.add(Json.createArrayBuilder().add(-35.8098577911).add(-6.5779781769))
											.add(Json.createArrayBuilder().add(-35.7768839051).add(-6.5956397380))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503555")
											.add("name", "Cacimbas")
											.add("description", "Cacimbas"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-37.0016016257).add(-7.1753310739))
											.add(Json.createArrayBuilder().add(-37.0188145603).add(-7.1900526573))
											.add(Json.createArrayBuilder().add(-37.0343006058).add(-7.1895159274))
											.add(Json.createArrayBuilder().add(-37.0292936098).add(-7.2049225504))
											.add(Json.createArrayBuilder().add(-37.0292700138).add(-7.2049945514))
											.add(Json.createArrayBuilder().add(-37.0145175614).add(-7.2503422075))
											.add(Json.createArrayBuilder().add(-37.0295301269).add(-7.2485869644))
											.add(Json.createArrayBuilder().add(-37.0341087403).add(-7.2546562711))
											.add(Json.createArrayBuilder().add(-37.0405972891).add(-7.2554652273))
											.add(Json.createArrayBuilder().add(-37.0407027952).add(-7.2554785430))
											.add(Json.createArrayBuilder().add(-37.0519186487).add(-7.2561487271))
											.add(Json.createArrayBuilder().add(-37.0540001807).add(-7.2526153689))
											.add(Json.createArrayBuilder().add(-37.0626378531).add(-7.2507688870))
											.add(Json.createArrayBuilder().add(-37.0662573183).add(-7.2442051307))
											.add(Json.createArrayBuilder().add(-37.0708448693).add(-7.2438076724))
											.add(Json.createArrayBuilder().add(-37.0731583733).add(-7.2350424721))
											.add(Json.createArrayBuilder().add(-37.0772933971).add(-7.2335643675))
											.add(Json.createArrayBuilder().add(-37.0874647234).add(-7.2371723448))
											.add(Json.createArrayBuilder().add(-37.1238276450).add(-7.2416232211))
											.add(Json.createArrayBuilder().add(-37.1454993492).add(-7.2460732332))
											.add(Json.createArrayBuilder().add(-37.1718238561).add(-7.2370248197))
											.add(Json.createArrayBuilder().add(-37.1759725482).add(-7.2302549040))
											.add(Json.createArrayBuilder().add(-37.1711812831).add(-7.2271114638))
											.add(Json.createArrayBuilder().add(-37.1738844013).add(-7.2236753901))
											.add(Json.createArrayBuilder().add(-37.1702231133).add(-7.2177172295))
											.add(Json.createArrayBuilder().add(-37.1662179340).add(-7.2111978416))
											.add(Json.createArrayBuilder().add(-37.1690092679).add(-7.2073621775))
											.add(Json.createArrayBuilder().add(-37.1718797016).add(-7.1987149639))
											.add(Json.createArrayBuilder().add(-37.1602164176).add(-7.1914808792))
											.add(Json.createArrayBuilder().add(-37.1480663669).add(-7.1940987014))
											.add(Json.createArrayBuilder().add(-37.1338511072).add(-7.1887063299))
											.add(Json.createArrayBuilder().add(-37.1325473568).add(-7.1874179529))
											.add(Json.createArrayBuilder().add(-37.1149909589).add(-7.1784953396))
											.add(Json.createArrayBuilder().add(-37.1055682898).add(-7.1786043878))
											.add(Json.createArrayBuilder().add(-37.0987089546).add(-7.1865707344))
											.add(Json.createArrayBuilder().add(-37.0902582818).add(-7.1867733133))
											.add(Json.createArrayBuilder().add(-37.0870482125).add(-7.1815613054))
											.add(Json.createArrayBuilder().add(-37.0885044055).add(-7.1687008654))
											.add(Json.createArrayBuilder().add(-37.0735471568).add(-7.1639274234))
											.add(Json.createArrayBuilder().add(-37.0698435849).add(-7.1577715631))
											.add(Json.createArrayBuilder().add(-37.0629705111).add(-7.1545422573))
											.add(Json.createArrayBuilder().add(-37.0447670228).add(-7.1575639933))
											.add(Json.createArrayBuilder().add(-36.9999303331).add(-7.1739018906))
											.add(Json.createArrayBuilder().add(-37.0016016257).add(-7.1753310739))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503605")
											.add("name", "Caiçara")
											.add("description", "Caiçara"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-35.3893360999).add(-6.5984806414))
											.add(Json.createArrayBuilder().add(-35.3757220378).add(-6.6029229204))
											.add(Json.createArrayBuilder().add(-35.3720273459).add(-6.5981052716))
											.add(Json.createArrayBuilder().add(-35.3612121060).add(-6.5982911045))
											.add(Json.createArrayBuilder().add(-35.3538734677).add(-6.5959525709))
											.add(Json.createArrayBuilder().add(-35.3474837552).add(-6.5979691110))
											.add(Json.createArrayBuilder().add(-35.3406233503).add(-6.5891938315))
											.add(Json.createArrayBuilder().add(-35.3348662500).add(-6.5918181309))
											.add(Json.createArrayBuilder().add(-35.3305765906).add(-6.5886538517))
											.add(Json.createArrayBuilder().add(-35.3309014590).add(-6.5963144169))
											.add(Json.createArrayBuilder().add(-35.3263128846).add(-6.6021893004))
											.add(Json.createArrayBuilder().add(-35.3283793556).add(-6.6208270533))
											.add(Json.createArrayBuilder().add(-35.3474629530).add(-6.6203562615))
											.add(Json.createArrayBuilder().add(-35.3566794031).add(-6.6129540010))
											.add(Json.createArrayBuilder().add(-35.3573484123).add(-6.6160012675))
											.add(Json.createArrayBuilder().add(-35.3592583259).add(-6.6316818946))
											.add(Json.createArrayBuilder().add(-35.3747201523).add(-6.6277554131))
											.add(Json.createArrayBuilder().add(-35.3778521495).add(-6.6432766565))
											.add(Json.createArrayBuilder().add(-35.3787320307).add(-6.6476387712))
											.add(Json.createArrayBuilder().add(-35.3909011546).add(-6.6491804260))
											.add(Json.createArrayBuilder().add(-35.3927431284).add(-6.6620819370))
											.add(Json.createArrayBuilder().add(-35.4024025167).add(-6.6592702968))
											.add(Json.createArrayBuilder().add(-35.4147177626).add(-6.6731551537))
											.add(Json.createArrayBuilder().add(-35.4157773475).add(-6.6740186713))
											.add(Json.createArrayBuilder().add(-35.4230591511).add(-6.6667822662))
											.add(Json.createArrayBuilder().add(-35.4920396538).add(-6.6512755736))
											.add(Json.createArrayBuilder().add(-35.5081073415).add(-6.6476606063))
											.add(Json.createArrayBuilder().add(-35.5033038158).add(-6.6445217310))
											.add(Json.createArrayBuilder().add(-35.5030460162).add(-6.6323603787))
											.add(Json.createArrayBuilder().add(-35.4941357619).add(-6.6351508291))
											.add(Json.createArrayBuilder().add(-35.4903869761).add(-6.6227846877))
											.add(Json.createArrayBuilder().add(-35.4812847544).add(-6.6162718778))
											.add(Json.createArrayBuilder().add(-35.4726390687).add(-6.6160387291))
											.add(Json.createArrayBuilder().add(-35.4698908010).add(-6.6111811430))
											.add(Json.createArrayBuilder().add(-35.4665094306).add(-6.6107276579))
											.add(Json.createArrayBuilder().add(-35.4647106911).add(-6.6110269390))
											.add(Json.createArrayBuilder().add(-35.4538414293).add(-6.6118804234))
											.add(Json.createArrayBuilder().add(-35.4476489289).add(-6.6281356769))
											.add(Json.createArrayBuilder().add(-35.4438932900).add(-6.6297515639))
											.add(Json.createArrayBuilder().add(-35.4292012231).add(-6.6165458692))
											.add(Json.createArrayBuilder().add(-35.4246863709).add(-6.5776432669))
											.add(Json.createArrayBuilder().add(-35.4232752843).add(-6.5642031555))
											.add(Json.createArrayBuilder().add(-35.4062627167).add(-6.5299336249))
											.add(Json.createArrayBuilder().add(-35.4074337763).add(-6.4891830007))
											.add(Json.createArrayBuilder().add(-35.4004245512).add(-6.4912024445))
											.add(Json.createArrayBuilder().add(-35.3794961632).add(-6.5025260678))
											.add(Json.createArrayBuilder().add(-35.3641881912).add(-6.5116399632))
											.add(Json.createArrayBuilder().add(-35.3758872062).add(-6.5300792564))
											.add(Json.createArrayBuilder().add(-35.3964026473).add(-6.5624215225))
											.add(Json.createArrayBuilder().add(-35.3946460684).add(-6.5729714390))
											.add(Json.createArrayBuilder().add(-35.3893360999).add(-6.5984806414))
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "2503704")
											.add("name", "Cajazeiras")
											.add("description", "Cajazeiras"))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
											.add(Json.createArrayBuilder().add(-38.5621792943).add(-6.7964757840))
											.add(Json.createArrayBuilder().add(-38.5318619234).add(-6.8040618273))
											.add(Json.createArrayBuilder().add(-38.4947038593).add(-6.8053799110))
											.add(Json.createArrayBuilder().add(-38.4657615841).add(-6.8098177634))
											.add(Json.createArrayBuilder().add(-38.4299362808).add(-6.8138904286))
											.add(Json.createArrayBuilder().add(-38.4228216228).add(-6.8092463392))
											.add(Json.createArrayBuilder().add(-38.4194472398).add(-6.8365208779))
											.add(Json.createArrayBuilder().add(-38.4179154383).add(-6.8488973766))
											.add(Json.createArrayBuilder().add(-38.4186673622).add(-6.8668493292))
											.add(Json.createArrayBuilder().add(-38.4187140851).add(-6.8670227135))
											.add(Json.createArrayBuilder().add(-38.4255973063).add(-6.8923256254))
											.add(Json.createArrayBuilder().add(-38.4324729339).add(-6.8984975015))
											.add(Json.createArrayBuilder().add(-38.4306525047).add(-6.9118429077))
											.add(Json.createArrayBuilder().add(-38.4269484086).add(-6.9366146583))
											.add(Json.createArrayBuilder().add(-38.4234257608).add(-6.9623741759))
											.add(Json.createArrayBuilder().add(-38.4224724388).add(-6.9659866315))
											.add(Json.createArrayBuilder().add(-38.4046042462).add(-6.9677046113))
											.add(Json.createArrayBuilder().add(-38.3873667086).add(-6.9865759408))
											.add(Json.createArrayBuilder().add(-38.4328044931).add(-6.9861565119))
											.add(Json.createArrayBuilder().add(-38.4468063593).add(-6.9870799341))
											.add(Json.createArrayBuilder().add(-38.4530469685).add(-6.9844305094))
											.add(Json.createArrayBuilder().add(-38.4533041826).add(-6.9843217317))
											.add(Json.createArrayBuilder().add(-38.4718292377).add(-6.9885823498))
											.add(Json.createArrayBuilder().add(-38.5033040229).add(-6.9894077925))
											.add(Json.createArrayBuilder().add(-38.5036841619).add(-6.9962243843))
											.add(Json.createArrayBuilder().add(-38.5140915748).add(-6.9987830967))
											.add(Json.createArrayBuilder().add(-38.5213347931).add(-7.0088060233))
											.add(Json.createArrayBuilder().add(-38.5292040675).add(-7.0117184174))
											.add(Json.createArrayBuilder().add(-38.5462252737).add(-7.0321276756))
											.add(Json.createArrayBuilder().add(-38.5612754070).add(-7.0252023362))
											.add(Json.createArrayBuilder().add(-38.5668197837).add(-7.0258554024))
											.add(Json.createArrayBuilder().add(-38.5669898595).add(-7.0259944231))
											.add(Json.createArrayBuilder().add(-38.5760973443).add(-7.0337325157))
											.add(Json.createArrayBuilder().add(-38.5886906070).add(-7.0545264710))
											.add(Json.createArrayBuilder().add(-38.6004128070).add(-7.0548222042))
											.add(Json.createArrayBuilder().add(-38.6118529853).add(-7.0546204327))
											.add(Json.createArrayBuilder().add(-38.6338606829).add(-7.0448647436))
											.add(Json.createArrayBuilder().add(-38.6397738979).add(-7.0463776304))
											.add(Json.createArrayBuilder().add(-38.6632893042).add(-7.0356372208))
											.add(Json.createArrayBuilder().add(-38.6694951117).add(-7.0473017260))
											.add(Json.createArrayBuilder().add(-38.6726617473).add(-7.0458276162))
											.add(Json.createArrayBuilder().add(-38.6735110796).add(-7.0387188905))
											.add(Json.createArrayBuilder().add(-38.6621799067).add(-7.0180772258))
											.add(Json.createArrayBuilder().add(-38.6700351697).add(-7.0121900605))
											.add(Json.createArrayBuilder().add(-38.6680699766).add(-7.0008558134))
											.add(Json.createArrayBuilder().add(-38.6720460515).add(-6.9965993688))
											.add(Json.createArrayBuilder().add(-38.6620143372).add(-6.9901698741))
											.add(Json.createArrayBuilder().add(-38.6648283614).add(-6.9860245555))
											.add(Json.createArrayBuilder().add(-38.6588175104).add(-6.9820737408))
											.add(Json.createArrayBuilder().add(-38.6571188365).add(-6.9758297821))
											.add(Json.createArrayBuilder().add(-38.6596073134).add(-6.9745161748))
											.add(Json.createArrayBuilder().add(-38.6583911345).add(-6.9697918023))
											.add(Json.createArrayBuilder().add(-38.6627099198).add(-6.9667488701))
											.add(Json.createArrayBuilder().add(-38.6577130534).add(-6.9627709606))
											.add(Json.createArrayBuilder().add(-38.6609884534).add(-6.9562740427))
											.add(Json.createArrayBuilder().add(-38.6605798312).add(-6.9521944371))
											.add(Json.createArrayBuilder().add(-38.6554978333).add(-6.9518947957))
											.add(Json.createArrayBuilder().add(-38.6487874769).add(-6.9422857612))
											.add(Json.createArrayBuilder().add(-38.6519540523).add(-6.9369762256))
											.add(Json.createArrayBuilder().add(-38.6454133061).add(-6.9252415270))
											.add(Json.createArrayBuilder().add(-38.6524358142).add(-6.9003129386))
											.add(Json.createArrayBuilder().add(-38.6485755103).add(-6.8915296512))
											.add(Json.createArrayBuilder().add(-38.6536815657).add(-6.8882757951))
											.add(Json.createArrayBuilder().add(-38.6485461936).add(-6.8769888248))
											.add(Json.createArrayBuilder().add(-38.6410407331).add(-6.8544965272))
											.add(Json.createArrayBuilder().add(-38.6282854163).add(-6.8472140378))
											.add(Json.createArrayBuilder().add(-38.6272329114).add(-6.8411291129))
											.add(Json.createArrayBuilder().add(-38.6151594886).add(-6.8409425464))
											.add(Json.createArrayBuilder().add(-38.6181515512).add(-6.8316959302))
											.add(Json.createArrayBuilder().add(-38.6075918587).add(-6.8200264371))
											.add(Json.createArrayBuilder().add(-38.6066006759).add(-6.8137685262))
											.add(Json.createArrayBuilder().add(-38.5979668722).add(-6.8121857655))
											.add(Json.createArrayBuilder().add(-38.5919494125).add(-6.8037980490))
											.add(Json.createArrayBuilder().add(-38.5858639445).add(-6.8040344401))
											.add(Json.createArrayBuilder().add(-38.5866217554).add(-6.8003679516))
											.add(Json.createArrayBuilder().add(-38.5735782849).add(-6.8014810239))
											.add(Json.createArrayBuilder().add(-38.5674355269).add(-6.7905317574))
											.add(Json.createArrayBuilder().add(-38.5621792943).add(-6.7964757840))
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					

			
					
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
					
					.add(Json.createObjectBuilder() // cria objeto {}
							.add("type", "Feature")
							.add("properties",
									Json.createObjectBuilder().add("id", "")
											.add("name", "")
											.add("description", ""))
							.add("geometry", Json.createObjectBuilder().add("type", "Polygon").add("coordinates",
									Json.createArrayBuilder().add(Json.createArrayBuilder()
										//inf	
											
											
									)

			)// array with all lat and lng of a city

			))// fecha obj geometry and obj properties
			
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
).build(); // final de tudo
	
	String result = creatingJson.toString();
	
	System.out.println(result);
	
	criarJson(result);
	
	}
	
	private void criarJson(String createJson){
		FileWriter writer= null;
		try {
			writer= new FileWriter("C:/Users/Lucas/workspace/Projetoweb/src/main/webapp/resources/json/GeoJson.json");
			// writer= new FileWriter("../Projetoweb/src/main/webapp/resources/json/escolaMunicipal.json"); erro de caminho nao sei pq
			 writer.write(createJson);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(writer!=null){
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
