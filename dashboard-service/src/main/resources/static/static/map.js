const   provinceToPinyin = {
	黑龙江省:"heilongjiang",
	吉林省:"jilin",
	辽宁省:"liaoning",
	内蒙古自治区:"neimenggu",
	河北省:"hebei",
	北京市:"beijing",
	天津市:"tianjin",
	山东省:"shandong",
	山西省:"shanxi",
	陕西省:"shanxisheng",
	宁夏回族自治区:"ningxia",
	甘肃省:"gansu",
	新疆维吾尔自治区:"xinjiang",
	西藏自治区:"xizang",
	青海省:"qinghai",
	四川省:"sichuan",
	云南省:"yunnan",
	重庆市:"chongqing",
	贵州省:"guizhou",
	广西壮族自治区:"guangxi",
	湖北省:"hubei",
	湖南省:"hunan",
	河南省:"henan",
	安徽省:"anhui",
	江苏省:"jiangsu",
	江西省:"jiangxi",
	浙江省:"zhejiang",
	福建省:"fujian",
	广东省:"guangdong",
	海南省:"hainan",
	台湾省:"taiwan",
	上海市:"shanghai"
}

// 转换方法
// provinceName:中文省份字符串  
// 	return 省份拼音字符串和获取省份数据的请求路径
const   getProvinceMapInfo = (provinceName) =>{
	console.log(provinceName)
	const path = `/static/map/province/${provinceToPinyin[provinceName]}.json`;
	return {
		name:provinceToPinyin[provinceName],
		path
	}
}

// const getCityMapInfo = (cityName)=>{
//   console.log(cityName);
//   const path = "/static/map/province/${}"
// }
export  default  getProvinceMapInfo