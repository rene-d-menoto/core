/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.wicketstuff.jqplot.lib.test;

import java.util.ArrayList;
import java.util.List;

import org.wicketstuff.jqplot.lib.JqPlotUtils;
import org.wicketstuff.jqplot.lib.chart.PieDonutChart;
import org.wicketstuff.jqplot.lib.data.item.LabeledItem;

import junit.framework.TestCase;

/**
 *
 * @author inaiat
 */
public class PieDonutChartTest extends TestCase {

    public PieDonutChartTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLabeledLine() {
    	PieDonutChart<Integer> chart = new PieDonutChart<>();

    	List<LabeledItem<Integer>> list = new ArrayList<>();
    	list.add(new LabeledItem<>("a",1));
    	list.add(new LabeledItem<>("b",2));

    	List<LabeledItem<Integer>> list2 = new ArrayList<>();
    	list2.add(new LabeledItem<>("a",1));
    	list2.add(new LabeledItem<>("b",2));


    	chart.addValue(list);
    	chart.addValue(list2);

        System.out.println(JqPlotUtils.createJquery(chart, "chart"));
    }
}
