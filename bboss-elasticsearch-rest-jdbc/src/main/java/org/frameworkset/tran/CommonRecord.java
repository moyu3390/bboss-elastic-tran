package org.frameworkset.tran;
/**
 * Copyright 2020 bboss
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>Description: </p>
 * <p></p>
 * <p>Copyright (c) 2020</p>
 * @Date 2021/1/28 21:03
 * @author biaoping.yin
 * @version 1.0
 */
public class CommonRecord {
	private List<Param> params;

	public Map<String, Object> getDatas() {
		return datas;
	}

	public void setDatas(Map<String, Object> datas) {
		this.datas = datas;
	}

	private Map<String,Object> datas;
	public List<Param> getParams() {
		return params;
	}
	public void addData(String name,Object value){
		if(datas == null)
			datas = new HashMap<String, Object>();
		datas.put(name,value);
	}
	public void setParams(List<Param> params) {
		this.params = params;
	}
	public int size(){
		if(params != null)
			return params.size();
		else if(datas != null)
			return datas.size();
		return 0;
	}
	public Param get(int idx){
		return params.get(idx);
	}
	public Object getData(String name){
		if(datas != null)
			return datas.get(name);
		return null;
	}
	public boolean containKey(String name){
		if(datas != null)
			return datas.containsKey(name);
		return false;
	}

}
