package org.aryalinux.restapp.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.aryalinux.restapp.common.EntityList;

import com.fasterxml.jackson.databind.ObjectMapper;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class EntityMapper {
	private Map<String, Class> entities;

	public EntityMapper() {
		entities = new LinkedHashMap<String, Class>();
	}

	public Map<String, Class> getEntities() {
		return entities;
	}

	public void setEntities(Map<String, Class> entities) {
		this.entities = entities;
	}

	public Object convert(Map<String, Object> data, String name) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			Object pojo = mapper.convertValue(data, entities.get(name));
			return pojo;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public EntityList convert(Map<String, Object> data) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			EntityList pojo = (EntityList) mapper.convertValue(data, EntityList.class);
			List<Object> newEntities = new ArrayList<Object>();
			for (Object obj : pojo.getEntities()) {
				Map<String, Object> map = (Map<String, Object>) obj;
				String typeName = map.get("__object_id").toString();
				map.remove("__object_id");
				Object entity = mapper.convertValue(map, entities.get(typeName));
				newEntities.add(entity);
				System.out.println(entities.get(typeName));
				System.out.println(entity.getClass());
			}
			pojo.setEntities(newEntities);
			return pojo;
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public Class getClassForName(String name) {
		try {
			return entities.get(name);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}