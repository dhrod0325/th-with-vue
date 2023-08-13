<template>
  <div class="chart-container">
    <h2 v-text="chartTitle"></h2>
    <ul>
      <li v-for="item in chartData" v-bind:key="item">
        <span v-text="item"></span>
      </li>
    </ul>

  </div>
</template>

<script>

export default {
  name: "WeekChart",

  props: {
    chartTitle: {
      type: String
    },
    chartData: {
      type: Array,
      required: true,
    },
  },

  mounted: function () {
    console.log(this.chartData);
  }
};
</script>