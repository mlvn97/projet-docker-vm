<script setup lang="ts">
</script>

<template>
  <div id="background"></div>
</template>

<style lang="css">
#background {
  position: fixed;
  inset: 0;
  background-image: url('/images/background.jpg');
  background-size: cover;
  background-position: center;
  transform: scale(1.01);
  z-index: -1;
}

#background::after {
  content: "";
  position: absolute;
  inset: 0;
  background: rgba(0, 0, 0, 0.3);
}
</style>
