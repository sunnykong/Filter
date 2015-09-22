package com.kong.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.alibaba.fastjson.serializer.JSONSerializable;
import com.kong.json.JSONSerializerUtils;

public class ComparaTest extends webTest{
	
	@Test
	public void comparable() {
		List<Student> students = new ArrayList<Student>();
		Student student = new Student(1, "1");
		Student student2 = new Student(2, "2");
		students.add(student);
		students.add(student2);
		Collections.sort(students);
		System.out.println(JSONSerializerUtils.serialize(students));
	}
}
