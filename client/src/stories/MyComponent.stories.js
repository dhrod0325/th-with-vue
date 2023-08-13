import MyComponent from "../components/MyComponent.vue";

export default {
    title: 'MyComponent',
    component: MyComponent,
};

export const Default = () => ({
    components: {
        'my-component': MyComponent
    },
    template: `<my-component v-bind:title="'안녕하세요우'" />`
});