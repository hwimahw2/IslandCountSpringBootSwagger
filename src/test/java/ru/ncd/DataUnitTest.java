package ru.ncd;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import ru.ncd.objects.Graph;
import ru.ncd.objects.Matrix;

import java.io.InputStream;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DataUnitTest {
    @Mock
    Matrix matrix;

    @Mock
    Graph graph;

    @Mock
    InputStream fileStream;

    @Test
    public void testCountResult() throws Exception {
        Data data = new Data();
        char[][] array = {{'#', '#'}};
        Mockito.when(matrix.getN()).thenReturn(1);
        Mockito.when(matrix.getM()).thenReturn(2);
        Mockito.when(matrix.getArrayMatrix()).thenReturn(array);
        Mockito.when(graph.quantityOfIslands(graph)).thenReturn(1);
        int result = data.countResult(matrix, graph);
        assertEquals("result is not right", 1, result);
    }
}
