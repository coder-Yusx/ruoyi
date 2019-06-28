package com.ruoyi.common.core.domain;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * 普通帮助类  
 * @author h
 *
 */
public class Common {
	
	/**
	 * 将类的对象  转换为Map
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public Map<String, String> ObjToMap(Object obj) {  
		try{
			Map<String, String> mapValue = new HashMap<String, String>();  
	        Class<?> cls = obj.getClass();  
	        Field[] fields = cls.getDeclaredFields();  
	        for (Field field : fields) {  
	            String name = field.getName();  
	            String strGet = "get" + name.substring(0, 1).toUpperCase() + name.substring(1, name.length());  
	            Method methodGet = cls.getDeclaredMethod(strGet);  
	            Object object = methodGet.invoke(obj);  
	            String value = object != null ? object.toString() : "";  
	            mapValue.put(name, value);  
	        }  
	        return mapValue;
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}  
    }
	
	/**
	 * 获得 32位全大写 UUID
	 * @return
	 */
	public static String getUUID(){
		UUID uuid=UUID.randomUUID();
		String str=uuid.toString().replace("-","").toUpperCase();
		return str;
	}
	
	/**
	 * 获得当前时间 
	 * 例如: 2017-01-16 11:12:23
	 * @return
	 */
	public static String getTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
	}
	
	
	/**
	 * 获取当前日期
	 * 例如：2017-05-09
	 * 
	 */
	public static String getDate(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
	}
	
	/**
	 * 获取当前年份
	 * 例如：2017
	 * 
	 */
	public static String getYear(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
	}
	
	/**
	 * 获取当前时间-无间隔符
	 * 例如：20170303144758
	 * @return
	 */
	public static String getLongTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
		return df.format(new Date());
	}
	
	/**
	 * 获取当前时间之后105分钟的时刻
	 * 例如：当前2017-03-22 14:31:35，期后105分钟即为16:16:35
	 */
	public static String get105Later(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long curren = System.currentTimeMillis();
		curren += 105*60;
		Date date = new Date(curren);
		return sdf.format(date);
	}
	
	
	/**
	 * 进行加密  bcrypt
	 * 不合适的加密长度 返回null
	 * @param pwd
	 * @return
	 */
/*	public static String getPwd(String pwd){
		PasswordEncoder  encoder=new BCryptPasswordEncoder();
		if(pwd.length()<4 || pwd.length()>31){
			return null;
		}
		return encoder.encode(pwd);
	}*/
	
	/**
	 * md5 加密
	 *  //admin-->21232f297a57a5a743894a0e4a801fc3
     *  //123456->e10adc3949ba59abbe56e057f20f883e
	 * @param info
	 * @return
	 */
	public static String getMD5(String info) {  
		
		byte[] source=info.getBytes();
        String s = null;  
        char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',  
                'a', 'b', 'c', 'd', 'e', 'f' };// 用来将字节转换成16进制表示的字符   
        try {  
            java.security.MessageDigest md = java.security.MessageDigest  
                    .getInstance("MD5");  
            md.update(source);  
            byte tmp[] = md.digest();// MD5 的计算结果是一个 128 位的长整数，   
            // 用字节表示就是 16 个字节   
            char str[] = new char[16 * 2];// 每个字节用 16 进制表示的话，使用两个字符， 所以表示成 16   
            // 进制需要 32 个字符   
            int k = 0;// 表示转换结果中对应的字符位置   
            for (int i = 0; i < 16; i++) {// 从第一个字节开始，对 MD5 的每一个字节// 转换成 16   
                // 进制字符的转换   
                byte byte0 = tmp[i];// 取第 i 个字节   
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];// 取字节中高 4 位的数字转换,// >>>   
                // 为逻辑右移，将符号位一起右移   
                str[k++] = hexDigits[byte0 & 0xf];// 取字节中低 4 位的数字转换   
  
            }  
            s = new String(str);// 换后的结果转换为字符串   
  
        } catch (NoSuchAlgorithmException e) {  
            // TODO Auto-generated catch block   
            e.printStackTrace();  
        }  
        return s;  
    } 
	
	/**
	 * 判断字符串 NUll 或 ""  或 "   "
	 * 是 false
	 * 否  true
	 * @param obj
	 * @return
	 */
	public static boolean notEmpty(Object obj){
		if(obj==null || "".equals(obj.toString().trim())){
			return false;
		}
		return true;
	}
     
	/**
	 * 返回当前数据库类型
	 * 0     判断数据库失败
	 * 1  mysql
	 * 2  oracle
	 * @return
	 */
/*	public static int dataBaseType(){
		PropertiesManager manager=new PropertiesManager();
		Map<String,String> jdbcMap=manager.readProperties("jdbc.properties");
		if(jdbcMap!=null){  	
			if(jdbcMap.get("driver")!=null){
				String sz=jdbcMap.get("driver").toString();
				String numStr[]=sz.split("\\.");
				if(numStr.length<=2){
					return 0;
				}
				if("oracle".equals(numStr[0])){ //oracle数据库    oracle.jdbc.driver.OracleDriver
					return 2;
				}
				if("mysql".equals(numStr[1])){	//mysql数据库  com.mysql.jdbc.Driver
					return 1;
				}
			}
		}
		return 0;
	}*/
	
	/**
	 * 将字符串String类型转化为Date类型
	 * 入参：String dateStr；
	 * 出参：Date time；
	 * @throws ParseException 
	 * */
	public  static Date StringToDate(String dateStr){
	SimpleDateFormat datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time=null;
	try {
		time = datetime.parse(dateStr);
	} catch (Exception e) {
		e.printStackTrace();
	}
	return time;
  }
	/**
	 * 计算时间差（精确到秒）
	 * 
	 * @param dateA
	 * @param dateB
	 * @return
	 */
	public static Long getDateBy2Date(String dateA, String dateB)
	{
		Date dA = StringToDate(dateA);
		Date dB = StringToDate(dateB);
		Long times= dA.getTime() - dB.getTime();
		Long time=times / 1000;// 计算时间差，精确到秒
		return time;
	}
	
	/**
	 * 不足的，前面补零，保持num 位数不变
	 * @param code
	 * @param num
	 * @return
	 */
	public static String autoGenericCode(String code, int num) {
        String result = "";
        result = String.format("%0" + num + "d", Integer.parseInt(code) + 1);

        return result;
    }
}
