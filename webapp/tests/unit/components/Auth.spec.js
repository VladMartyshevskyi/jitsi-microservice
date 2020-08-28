import { shallowMount } from '@vue/test-utils';
import Auth from '@/components/Auth'

describe('Auth.vue', () => {
  it('should render Auth', () => {
    const wrapper = shallowMount(Auth);
    const title = wrapper.find('h1');
    expect(title.text()).toEqual('Welcome to Your Vue.js App');
  })
})
