import axios from '@/utils/request'

export function page() {
  return axios({
    url: '/api/sysDictType/page',
    method: 'GET'
  })
}