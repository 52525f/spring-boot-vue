<template>
  <div class="hello">
    <h1>{{ response }}</h1>
  </div>
</template>

<script>
import axios from 'axios'

export default {
  name: 'HelloWorld',
  data() {
    return {
      response: '',
      error: ''
    }
  },
  created() {
      axios.get('http://localhost:8080/hello').then(response => {
        this.response = response.data
      }).catch(e => {
        this.error = e;
      })
  },
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
