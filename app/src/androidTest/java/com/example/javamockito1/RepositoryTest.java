package com.example.javamockito1;

import android.util.Log;

import androidx.arch.core.executor.testing.InstantTaskExecutorRule;
import androidx.lifecycle.MutableLiveData;

import com.example.javamockito1.repository.Repository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RepositoryTest {

    public static final int TEST_NUMBER_OF_LEAFS = 5;

    Repository r = mock(Repository.class);

    @Test
    public void shouldReturnGivenValue() {

        when(r.getNumberOfLeafs()).thenReturn(8);

        //when(repository.r()).thenReturn(8);
        int one = r.getNumberOfLeafs();
        int two = r.getNumberOfLeafs();
        //int getString = r.getNumberOfLeafs();
        //assertEquals(r, 8);

        verify(r, times(2)).getNumberOfLeafs();
        //verify that other mocks were not interacted
        //verifyZeroInteractions(r.getString());

    }
}