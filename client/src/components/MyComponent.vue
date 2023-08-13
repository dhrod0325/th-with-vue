<template>
  <h3>HELLO WORLD</h3>

  <span>{{ title }}</span>

  <div id="carouselExample" class="carousel slide" style="width:400px;">
    <div class="carousel-inner">
      <div class="carousel-item active">
        <img src="https://images.pexels.com/photos/1170986/pexels-photo-1170986.jpeg?auto=compress&cs=tinysrgb&w=1600"
             class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="https://images.pexels.com/photos/1643457/pexels-photo-1643457.jpeg?auto=compress&cs=tinysrgb&w=1600"
             class="d-block w-100" alt="...">
      </div>
      <div class="carousel-item">
        <img src="https://images.pexels.com/photos/1828875/pexels-photo-1828875.jpeg?auto=compress&cs=tinysrgb&w=1600"
             class="d-block w-100" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample"
            data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample"
            data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
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