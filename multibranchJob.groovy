multibranchPipelineJob('Example') {
  configure { project ->
      ( project / 'authToken' ).setValue('value')
  }
}
