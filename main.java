//____________________________________________________________________________________________
//Choose which log you want to use and then which bow type longbow or short
//____________________________________________________________________________________________
//User Variables to pick
int log_decision = 1;
//0 = magic 
//1 = yew 
//2 = maple
//3 = willow
int bow_decision = 0; // 0 = Longbow, 1 = Shortbow
// 0 = Longbow
//1 = Shortbow
//__________________________________________________________________________________________


//Hinamizawa's Variables Don't touch!

//Variables
int bow_string = 1777;
int bow_string_slot = v.getInventory().slot(bow_string);

//decision == 0
int log_0 = 1513; //magic log
int log_slot_0 = v.getInventory().slot(log_0);
int magic_unf_L = 70; //magic longbow unfinish
int magic_unf_S = magic_unf_L + 2;
int deposit_item_0 = 859; //magic long
int deposit_item_2_0 = deposit_item_0 + 2; //magic short
//decision == 1
int log_1 = 1515; //yew log
int log_slot_1 = v.getInventory().slot(log_0);
int yew_unf_L = 66;
int yew_unf_S = yew_unf_L + 2;
int deposit_item_1 = 855;
int deposit_item_2_1 = deposit_item_1 + 2;
//decision == 2
int log_2 = 1517; //Maple log
int log_slot_2 = v.getInventory().slot(log_2);
int maple_unf_L = 62;
int maple_unf_S = maple_unf_L + 2;
int deposit_item_2 = 851;
int deposit_item_2_2 = deposit_item_2 + 2;
//decision == 3
int log_3 = 1519; //Willow log
int log_slot_3 = v.getInventory().slot(log_3);
int willow_unf_L = 58;
int willow_unf_S = willow_unf_L + 2;
int deposit_item_3 = 847;
int deposit_item_2_3 = deposit_item_3 + 2;

if (log_decision == 0){
     if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_0, 14,14) || v.getInventory().amountInInventory(deposit_item_2_0, 14,14)) {
            if (bow_decision == 0) {
                v.getBank().deposit(deposit_item_0, 14);
            } else if (bow_decision == 1) {
                v.getBank().deposit(deposit_item_2_0, 14);
            }
        } 
        else if(v.getInventory().amountInInventory(bow_string, 1,14)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                        v.invoke("String","<col=ff9040>Magic longbow</col>",1,57,-1,17694734,false);                    
                    }
                    else if (bow_decision == 1) {
                        v.invoke("String","<col=ff9040>Magic shortbow</col>",1,57,-1,17694734,false);
                    }
                } else {
                     v.invoke("Use","<col=ff9040>Bow string</col>",0,25,9,9764864,false);
                     if (bow_decision == 0){
                     
                     v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Magic longbow (u)</col>",0,58,14,9764864,false);                
                }
                  else if (bow_decision == 1){
                     
                      v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Magic shortbow (u)</col>",0,58,14,9764864,false);
                }
                }
            }
        } else {
        	 if (bow_decision == 0) {
        	 
        		v.getBank().withdraw(magic_unf_L,14);
            v.getBank().withdraw(bow_string,14);
            }
            else if (bow_decision == 1)
            {
            v.getBank().withdraw(magic_unf_S,14);
            v.getBank().withdraw(bow_string,14);
            }
        }
    }
}
else if (log_decision == 1){
     if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_1, 14,14) || v.getInventory().amountInInventory(deposit_item_2_1, 14,14)) {
            if (bow_decision == 0) {
                v.getBank().deposit(deposit_item_1, 14);
            } else if (bow_decision == 1) {
                v.getBank().deposit(deposit_item_2_1, 14);
            }
        } 
        else if(v.getInventory().amountInInventory(bow_string, 1,14)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                        v.invoke("String","<col=ff9040>Yew longbow</col>",1,57,-1,17694734,false);                    
                    }
                    else if (bow_decision == 1) {
                        v.invoke("String","<col=ff9040>Yew shortbow</col>",1,57,-1,17694734,false);
                    }
                } else {
                     v.invoke("Use","<col=ff9040>Bow string</col>",0,25,9,9764864,false);
                     if (bow_decision == 0){
                     
                     v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Yew longbow (u)</col>",0,58,14,9764864,false);                
                }
                  else if (bow_decision == 1){
                     
                      v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Yew shortbow (u)</col>",0,58,14,9764864,false);
                }
                }
            }
        } else {
        	 if (bow_decision == 0) {
        	 
//        	v.getBank().depositAll(deposit_item_0);
        		v.getBank().withdraw(yew_unf_L,14);
            v.getBank().withdraw(bow_string,14);
            }
            else if (bow_decision == 1)
            {
            v.getBank().withdraw(yew_unf_S,14);
            v.getBank().withdraw(bow_string,14);
            }
        }
    }
}
else if (log_decision == 2){
     if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_2, 14,14) || v.getInventory().amountInInventory(deposit_item_2_2, 14,14)) {
            if (bow_decision == 0) {
                v.getBank().deposit(deposit_item_2, 14);
            } else if (bow_decision == 1) {
                v.getBank().deposit(deposit_item_2_2, 14);
            }
        } 
        else if(v.getInventory().amountInInventory(bow_string, 1,14)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                        v.invoke("String","<col=ff9040>Maple longbow</col>",1,57,-1,17694734,false);                    
                    }
                    else if (bow_decision == 1) {
                        v.invoke("String","<col=ff9040>Maple shortbow</col>",1,57,-1,17694734,false);
                    }
                } else {
                     v.invoke("Use","<col=ff9040>Bow string</col>",0,25,9,9764864,false);
                     if (bow_decision == 0){
                     
                     v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Maple longbow (u)</col>",0,58,14,9764864,false);                
                }
                  else if (bow_decision == 1){
                     
                      v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Maple shortbow (u)</col>",0,58,14,9764864,false);
                }
                }
            }
        } else {
        	 if (bow_decision == 0) {
        	 
//        	v.getBank().depositAll(deposit_item_0);
        		v.getBank().withdraw(maple_unf_L,14);
            v.getBank().withdraw(bow_string,14);
            }
            else if (bow_decision == 1)
            {
            v.getBank().withdraw(maple_unf_S,14);
            v.getBank().withdraw(bow_string,14);
            }
        }
    }
}
if (log_decision == 3){
     if(v.getLocalPlayer().hasAnimation(-1)) {
        if(v.getInventory().amountInInventory(deposit_item_3, 14,14) || v.getInventory().amountInInventory(deposit_item_2_3, 14,14)) {
            if (bow_decision == 0) {
                v.getBank().deposit(deposit_item_3, 14);
            } else if (bow_decision == 1) {
                v.getBank().deposit(deposit_item_2_3, 14);
            }
        } 
        else if(v.getInventory().amountInInventory(bow_string, 1,14)) {
            if(v.getBank().isOpen()) {
                v.getBank().close();
            } else {
                Widget multiSkillMenu = client.getWidget(270,0);
                if(multiSkillMenu != null) {
                    if (bow_decision == 0){
                        v.invoke("String","<col=ff9040>Willow longbow</col>",1,57,-1,17694734,false);                    
                    }
                    else if (bow_decision == 1) {
                        v.invoke("String","<col=ff9040>Willow shortbow</col>",1,57,-1,17694734,false);
                    }
                } else {
                     v.invoke("Use","<col=ff9040>Bow string</col>",0,25,9,9764864,false);
                     if (bow_decision == 0){
                     
                     v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Willow longbow (u)</col>",0,58,14,9764864,false);                
                }
                  else if (bow_decision == 1){
                     
                      v.invoke("Use","<col=ff9040>Bow string</col><col=ffffff> -> <col=ff9040>Willow shortbow (u)</col>",0,58,14,9764864,false);
                }
                }
            }
        } else {
        	 if (bow_decision == 0) {
        	 
//        	v.getBank().depositAll(deposit_item_0);
        		v.getBank().withdraw(willow_unf_L,14);
            v.getBank().withdraw(bow_string,14);
            }
            else if (bow_decision == 1)
            {
            v.getBank().withdraw(willow_unf_S,14);
            v.getBank().withdraw(bow_string,14);
            }
        }
    }
}