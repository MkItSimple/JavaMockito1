package com.example.javamockito1;

import android.util.Log;

import com.example.javamockito1.repository.Repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryTest {

    @Mock
    Repository repository;

    @Before
    public void setUp() throws Exception {
        //MockitoAnnotations.initMocks(Repository.class);
        //repository = Repository.class;
    }

    @Test
    public void getData() {
        //Repository repository = mock(Repository.class);
        when(repository.getData("choreyn")).thenReturn("yess!!!");
        Log.d("Choreyn", repository.getData("choreyn"));

    }
}