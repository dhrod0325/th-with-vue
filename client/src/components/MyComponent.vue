<template>
  <div class="myComponent">
    <h3>HELLO WORLD</h3>

    <span>{{title}}</span>
  </div>
</template>

<script>

export default {
  name: "MyComponent",

  props: {
    title: {
      type: String,
      required: false
    }
  },

  mounted: function () {
    console.log(this.title);
  }
};
</script>

<style scoped>
h3 {
  background: red;
  color: #fff;
}
</style>