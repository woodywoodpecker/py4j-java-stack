<template>
    <!-- https://vuejs.org/v2/guide/migration.html#Fragment-Instances-removed -->
    <div>
        <div>Man name: {{this.$parent.man.name}}</div>
        <div>Counter: {{this.$parent.counter}}</div>
    </div>
</template>

<script>
    module.exports = {
        data: function () {
            return {

            }
        }
    }
</script>

<style>

</style>