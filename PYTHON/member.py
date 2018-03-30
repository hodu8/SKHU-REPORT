member = {201732015 : "박찬우", 201732004 : "김문수", 201632034 : "한영빈", 201633036 : "한나라", 201632007 : "김희수"}
def getinfobyid (dict,id):
	return (dict[id],id)
	
def getinfobyname (dict,name):
	for key, val in dict.items():
		if val == name:
			return (key,val)