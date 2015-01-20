package com.matrix.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

public abstract class AbstractBaseRedisDao<K, V> {
	@Autowired
	protected RedisTemplate<K,V> redisTemplate;

	public RedisSerializer<String> getRedisSerializer() {
		return this.redisTemplate.getStringSerializer();
	}

	protected void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
		this.redisTemplate = redisTemplate;
	}
}
