import { shallowMount } from '@vue/test-utils'
import HelloWorld from '@/components/HelloWorld.vue'

describe('HelloWorld.vue', () => {
  it('renders response when passed', () => {
    const response = 'new message'
    const wrapper = shallowMount(HelloWorld, {
    })
    wrapper.setData({ response: response})
    expect(wrapper.text()).toMatch(response)
  })
})
