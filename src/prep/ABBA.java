/*  
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prep;

/**
 *
 * @author motamedi
 */
public class ABBA {
//    class ABBA(object):
//	def canObtain(self, a b):
//		if len(a>b):
//			return 'Impossible'
//      	if a==b:
//            return 'Possible'
//        
//        ret = self.canObtain(a+'A', b)
//        if ret=='Possible':
//        	return 'Possible'
//        ret = self.canObtain(a[::-1]+'B', b)
//        if ret=='Possible':
//            return 'Possible'
//                
//	return 'Impossible'
    public String canObtain(String a, String b) {
        if (a.length()>b.length()) {
            return "Impossible";
        }
        if (a.equals(b)) {
            return "Possible";
        }
        
        String t = canObtain(a+"A", b);
        if (t.equals("Possible")) {
            return "Possible";
        }
        t = canObtain(new StringBuilder(a).reverse().append("B").toString(), b);
        if (t.equals("Possible")) {
            return "Possible";
        }

        return "Impossible";            
    }
}
